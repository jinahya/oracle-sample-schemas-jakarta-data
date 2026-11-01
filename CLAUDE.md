# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this project is

Jakarta Data 1.0 repositories over the Jakarta Persistence mappings of
[`oracle-sample-schemas-persistence`](https://github.com/jinahya/oracle-sample-schemas-persistence), which maps the
[Oracle Database Sample Schemas](https://github.com/oracle-samples/db-sample-schemas). The sibling
`../oracle-sample-schemas-spring-data` does the same in Spring Data JPA, but this project does **not** follow its shape
or rules; design for Jakarta Data on its own terms. The shape is the one of `../postgresql-demodb-jakarta-data`, made
multi-module. The author's background is Java EE 5/6, so plain DAO-style explanations and container-free code are
preferred.

## Layout

A parent-less aggregator, `io.github.jinahya:oracle-sample-schemas-jakarta-data` (packaging `pom`), with one module
per schema, as upstream has:

| module | upstream module | entities | repositories | units |
| --- | --- | --- | --- | --- |
| `oracle-sample-schemas-jakarta-data-co` | `oracle-sample-schemas-persistence-co` | `...persistence.co` | `...persistence.co.data` | `co-test` / `co-it` |
| `oracle-sample-schemas-jakarta-data-hr` | `oracle-sample-schemas-persistence-hr` | `...persistence.hr` | `...persistence.hr.data` | `hr-test` / `hr-it` |
| `oracle-sample-schemas-jakarta-data-sh` | `oracle-sample-schemas-persistence-sh` | `...persistence.sh` | `...persistence.sh.data` | `sh-test` / `sh-it` |

(`...` is `com.github.jinahya.oracle.sample.schemas`.)

- The root `pom.xml` is also the modules' parent. It holds every version (`<properties>`, `<dependencyManagement>`),
  every plugin configuration (`<pluginManagement>`: compiler with its processors, enforcer, surefire, failsafe), the
  `failsafe` profile, and the dependencies every module shares (`<dependencies>`: the APIs, `hibernate-core`, the test
  libraries, the drivers). A module's own pom adds only its upstream module and that module's `test-companion` jar.
  Each module depends on its own upstream module only; the modules do not depend on each other.
- The modules are independent of each other, tests included: each carries its own test bases, Weld service and
  `persistence.xml`, in its own packages. A fix to one module's test base is carried to the other two by hand, unless
  it is specific to that module.

## Each module

- Main package: `<schema>.data` (`@NullMarked`, JSpecify; a lookup that may find nothing returns `Optional`), holding
  `_Repository<T, K>` and the repositories.
- Entities: `<schema>`, one package up, **in this module's `src/main`**. Each extends a mapped superclass of the
  upstream module (`MappedCustomer`, ...), and their static metamodel (`Customer_`, extending upstream's
  `MappedCustomer_`) is generated here.
- One repository per `@Entity`, `<Entity>Repository`, annotated `@Repository`. Each extends **both**
  `_Repository<Entity, Id>` (the unannotated shared base; Jakarta Data needs no `@NoRepositoryBean`) **and**
  `CrudRepository<Entity, Id>` directly. Drop the direct `CrudRepository` and `hibernate-processor` fails with
  "repository does not have a well-defined primary entity type for inherited member 'deleteById'". The repositories
  are empty for now. Views are entities too, so they have repositories like the tables.
- The id type is the entity's: the `@Id` attribute's type, or the `@EmbeddedId` / `@IdClass` class
  (`co`: `OrderItemId`, `ProductOrderId`; `hr`: `JobHistoryId`; `sh`: `CostId`, `FweekPscatSalesMvId`, `ProfitId`,
  `SalesId`). `sh`'s `Time` is keyed by a `LocalDateTime`.
- **One provider, no provider profiles.** Hibernate Data Repositories is the only Jakarta Data provider for Java SE:
  `hibernate-processor` implements every `@Repository` interface at compile time as a `<Name>_` class under
  `target/generated-sources/annotations`, which runs on an `org.hibernate.StatelessSession`. EclipseLink 5.0 has no
  Jakarta Data, so unlike upstream there is no EclipseLink axis here, and `persistence.xml` names the Hibernate
  provider directly instead of upstream's `${persistence-unit.provider}`.
- **The processor's Jakarta Data metamodel is suppressed** (`-AsuppressJakartaDataMetamodel=true` in the root pom):
  with `jakarta.data` on the classpath the processor would also write `_Customer extends _MappedCustomer`, and
  upstream, compiled without `jakarta.data`, never generated `_MappedCustomer`. javac warns that no processor
  recognized the option; it is honoured all the same (no `_Customer` is generated).
- No repository names a `dataStore`; the unit is the caller's choice. The generated `<Name>_` has a `public`
  constructor taking a `StatelessSession` (container-free use) and an `@Inject` no-arg constructor that opens its
  session from a `@PersistenceUnit` (CDI use).
- The published jars carry **the entities and the repositories**. `jakarta.data-api`, `jakarta.persistence-api`,
  `jakarta.validation-api`, `jakarta.annotation-api`, `jakarta.inject-api`, `cdi-api`, `hibernate-core`, `jspecify`
  and Lombok are all `provided`.
- `-parameters` is on (`maven.compiler.parameters`), as upstream: Jakarta Data binds query parameters by name.

## Upstream, and the entities

The sibling checkout `../oracle-sample-schemas-persistence` publishes, at `0.0.6-SNAPSHOT`, one jar per schema
(`io.github.jinahya:oracle-sample-schemas-persistence-co`, `-hr`, `-sh`) of **mapped superclasses, their generated
static metamodel, and the embeddables and converters that carry no association** (package `<schema>.mapped`), and a
second jar of each classified `test-companion` (`*_Randomizer` / `*_Persister` classes). They exist **only in the
local `~/.m2`**: after any change upstream, run `./mvnw -DskipTests install` there before building here. Its
`persistence.xml` files are test-only, so each module here supplies its own.

- **Upstream keeps its entities in `src/test`**, on purpose: which associations an entity maps, lazy or not, with
  what cascade, is an application's decision, and this project is that application. The entities here are copies of
  upstream's test classes, verbatim
  (`oracle-sample-schemas-persistence-<schema>/src/test/java/com/github/jinahya/oracle/sample/schemas/persistence/<schema>/<Entity>.java`
  there), in the same package, so that the `test-companion` randomizers and persisters, compiled against that
  package, find them. **Keep them in step with upstream**: diff against upstream's before touching a mapping, and
  change the mapping there first. They need nothing from upstream's test sources but each other.
- What was copied, per module: every entity, its id class, and, in `co`, the two keyless view classes below. Not
  copied: upstream's tests, test bases, producers, randomizers, persisters and test helpers (`*_TestUtils`,
  `*Utils`, `___Persistence_TestUtils`, `PromotionNamedId_TestAccess`).
- **Classes with no repository.** Only an `@Entity` gets one:
  - `co`'s `ProductReview` and `StoreOrder` map the views `PRODUCT_REVIEWS` and `STORE_ORDERS`, which no column, or
    combination of columns, identifies; upstream maps them by plain classes (no `@Entity`, no id), so there is no
    entity type for a repository. They are copied anyway, because `co`'s `test-companion` jar
    (`ProductReview_Randomizer`, `StoreOrder_Randomizer`) is compiled against them, and they are what a `@Query` of
    another repository would select a view row into.
  - The id classes (`OrderItemId`, `ProductOrderId`, `JobHistoryId`, `CostId`, `FweekPscatSalesMvId`, `ProfitId`,
    `SalesId`) are `@Embeddable`s, not entities.
- `co`'s `test-companion` jar also references `ProductDetails_TestUtils`, an upstream test helper it does not carry.
  Nothing here loads it yet; a test that draws a randomized `Product` (or anything that cascades to one) will fail with
  `NoClassDefFoundError` until that helper is copied into `co`'s `src/test`.
- Do not copy upstream's randomizers or persisters into `src/test`; the `test-companion` jar is on the test
  classpath. Podam and `jinahya-persistence-test-utils` are declared here because that jar brings no dependencies.
- The version properties in the root `pom.xml` (`version.jinahya-persistence`, `version.uk.co.jemos.podam`, Hibernate
  ORM `7.4.12.Final`, H2, `ojdbc17`, JUnit `5.14.4`, Hibernate Validator ...) deliberately mirror upstream's, so what
  compiles here against the test-companion jars is what those jars were compiled against, and the generated code runs
  on the ORM that generated upstream's metamodel. Change them in step with upstream, not independently.
- Read `../oracle-sample-schemas-persistence/README.md` and `CLAUDE.md` before touching anything about the mappings.

## Build

Maven wrapper (`./mvnw`); the build JDK must be **25** (enforced). Main and test sources both compile at release 25.
Every script below runs `clean` on purpose: a renamed or removed `@Repository` interface leaves a stale generated
`<Name>_` class that the next incremental compile fails on with an unexplained "cannot find symbol".

```sh
./_mvn_test.sh                         # unit tests on H2 (units `<schema>-test`); no database needed
./_mvn_verify.sh                       # + integration tests (*IT) against the Oracle below (units `<schema>-it`)
./_mvn_verify_notests.sh               # full lifecycle, tests compiled but not run; no database needed
./_mvn_test.sh -pl oracle-sample-schemas-jakarta-data-hr                 # one module
./_mvn_test.sh -pl oracle-sample-schemas-jakarta-data-hr -Dtest=JobRepository_Test
./_mvn_verify.sh -DskipTests           # the ITs alone
./_mvn_verify.sh -DskipITs             # the unit tests alone
./_mvn_verify.sh -Dit.test=JobRepository_IT -pl oracle-sample-schemas-jakarta-data-hr
```

Failsafe is bound only by the `failsafe` profile (`-Pfailsafe`, declared in the root and inherited), picking up
`**/*IT.java`; a plain `./mvnw verify` never runs an IT. As of surefire/failsafe 3.6.0, `-DskipTests` reaches surefire
only, so `-DskipITs` is the flag that stops the ITs. Both plugins stop after the first failing class
(`skipAfterFailureCount=1`). The enforcer runs on the aggregator and every module, and fails the build on dependency
non-convergence, a JDK below 25, and a `-P` naming a profile that does not exist. Check convergence across the whole
reactor: `./mvnw -q enforcer:enforce -Drules=dependencyConvergence`.

**The integration tests need the Oracle database container upstream owns**: run
`../oracle-sample-schemas-persistence/compose.sh` (Ctrl-C takes it down; the data, a bind mount, survives). It runs
`container-registry.oracle.com/database/free:latest-lite` on `localhost:1521/freepdb1` and installs `CO`, `HR` and
`SH` on first start. Each `<schema>-it` unit connects there as `dmlonly` / `password`, a DML-only user that owns no
objects, with `hbm2ddl.auto=none`; `META-INF/<schema>/orm-it.xml` (`<persistence-unit-defaults><schema>`) qualifies
every table of that unit with its schema. The sample data is the fixture the ITs read, and nothing may touch the schema
or leave rows behind.

## Tests

A Weld SE container per test method (`@EnableAutoWeld` on `__Repository_TestBase<R, T, K>`). The container creates the
generated `<R>_` through its `@Inject` constructor; the concrete test adds the class and names its types:

```java
@AddBeanClasses(JobRepository_.class)
class JobRepository_Test
        extends _Repository_Test<JobRepository, Job, String> {

    JobRepository_Test() {
        super(JobRepository.class, Job.class, String.class);
    }
}
```

Every entity has an empty `<Entity>Repository_Test` (unit `<schema>-test`, H2) and an empty `<Entity>Repository_IT`
(unit `<schema>-it`, Oracle). Each runs, for now, only the base's `findAll()` check. Every entity has a `_Test`:
upstream's `*_PersistenceTest`s run every entity on H2, the views and materialized views (whose tables H2 gets from
`create-drop`) and `JobHistory` (written by a trigger) with only the persisting of a random instance disabled.

`getRepositoryInstance()` returns the repository, one `@Dependent` instance (and `StatelessSession`) per test.
`_Repository_Test` (unit `<schema>-test`, empty H2 per test, insert what you query) and `_Repository_IT` (unit
`<schema>-it`, read the sample data, roll back any write) each add, with an inherited `@AddBeanClasses`, a nested
`EntityManagerFactoryProducer` for their unit. A write needs the repository's own session and its transaction
(`session(getRepositoryInstance()).inTransaction(...)`), or the injected `EntityManagerFactory`'s
`callInTransaction(em -> ...)` with upstream's persisters (`EntityPersisterUtils.newPersistedInstanceOf(em, X.class)`).
Three things are load-bearing:

- `<R>_` takes the factory from a `@PersistenceUnit` field, resource injection that no producer reaches and Weld SE
  does not fill. `__WeldJpaInjectionServices`, a test-only Weld `JpaInjectionServices` registered in each module's
  `src/test/resources/META-INF/services/org.jboss.weld.bootstrap.api.Service`, hands it the produced factory. Without
  it the field stays `null` (NPE in the generated `@PostConstruct`).
- The producer is `@Singleton`, not `@ApplicationScoped`: `<R>_`'s `unwrap(SessionFactory.class)` on a client proxy
  throws `ClassCastException`.
- The base does not `@Inject R`: an injection point typed by a type variable is a CDI definition error
  (WELD-001407), even when the subclass binds it. It injects `Instance<Object>` and selects `repositoryClass`.

Notes:

- `_Repository_IT`'s `findAll()` check collects every row; on the large `SH` tables (`SALES`, `CUSTOMERS`, `COSTS`)
  that is slow. Narrow it (a page, or a count) once the ITs are run in earnest.
- On the `hr` units Hibernate logs `HHH90005707: Unable to locate static metamodel field: ...JobHistory_.employeeId`
  (and `startDate`): `JobHistory`'s `@IdClass` attributes are declared by `MappedJobHistory`, so their metamodel
  fields are `MappedJobHistory_`'s. It is a warning only.

- `META-INF/persistence.xml`, per module: units `<schema>-test` (H2 `jdbc:h2:mem:;database_to_upper=false;MODE=LEGACY`,
  `sa` / `password`, `create-drop`) and `<schema>-it` (Oracle, `none`), mirroring upstream's; keep them in step. Both
  list exactly the classes upstream's units list, since `exclude-unlisted-classes` is on. The unit names keep
  upstream's schema prefix: the modules' test classpaths can meet in one JVM (an IDE running every test of the
  project), where two units of one name resolve to whichever descriptor is found first. For the same reason each
  `orm-it.xml` lives at `META-INF/<schema>/orm-it.xml`.
- `logback-test.xml`: root DEBUG, Hibernate at WARN except `org.hibernate.SQL` (DEBUG) and `org.hibernate.orm.jdbc.bind`
  (TRACE) for statements and bind values.

The test classpath also has Hibernate Validator + Expressly (to enforce the repositories' parameter constraints),
JUnit 5, AssertJ, Mockito, and the upstream `test-companion` randomizers/persisters.

## Style

As upstream's and the siblings': section-marker comments are line comments padded with dashes to column 120, and a
class lays its members out as constants, nested types, constructors, `java.lang.Object` methods, accessors, fields.
