# oracle-sample-schemas-jakarta-data

[Jakarta Data](https://jakarta.ee/specifications/data/1.0/) repositories for the
[Oracle Database Sample Schemas](https://github.com/oracle-samples/db-sample-schemas) (`CO`, `HR`, `SH`), over the
mapped superclasses of
[oracle-sample-schemas-persistence](https://github.com/jinahya/oracle-sample-schemas-persistence).

The sibling [oracle-sample-schemas-spring-data](https://github.com/jinahya/oracle-sample-schemas-spring-data) is the
same thing in Spring Data JPA.

## The modules

One per schema, as upstream:

| module | schema | entities | repositories |
| --- | --- | --- | --- |
| `oracle-sample-schemas-jakarta-data-co` | `CO` (Customer Orders) | `com.github.jinahya.oracle.sample.schemas.persistence.co` | `...co.data` |
| `oracle-sample-schemas-jakarta-data-hr` | `HR` (Human Resources) | `com.github.jinahya.oracle.sample.schemas.persistence.hr` | `...hr.data` |
| `oracle-sample-schemas-jakarta-data-sh` | `SH` (Sales History) | `com.github.jinahya.oracle.sample.schemas.persistence.sh` | `...sh.data` |

The root `pom.xml` is the aggregator and the parent of the three; each module depends on its own upstream module only.

## The entities

Upstream publishes mapped superclasses (`MappedCustomer`, ...) and their static metamodel, and keeps its entities in
its test sources: which associations to map, and how, is an application's decision. This project is that
application. Each module's entities, one per table and view, are copies of upstream's test entities, kept in step
with them; the repositories are one per entity.

## The provider

One: [Hibernate Data Repositories](https://docs.hibernate.org/orm/7.4/repositories/html_single/Hibernate_Data_Repositories.html).
`hibernate-processor` implements every `@Repository` interface at compile time as a `<Name>_` class, which runs on
a `StatelessSession` of Hibernate ORM. EclipseLink 5.0 implements Jakarta Persistence 3.2 only, no Jakarta Data,
so unlike upstream this build has no provider profiles.

## The database

Upstream owns the compose file:

```shell
$ cd ../oracle-sample-schemas-persistence && ./compose.sh
```

brings up an Oracle Database Free on `localhost:1521/freepdb1` with the sample schemas installed. Each module's
`<schema>-it` unit of `src/test/resources/META-INF/persistence.xml` connects there as the DML-only user `dmlonly` /
`password`, and its `META-INF/<schema>/orm-it.xml` qualifies every table with the schema.

## Building

```shell
$ ./_mvn_test.sh              # unit tests, H2
$ ./_mvn_verify.sh            # + integration tests, against the database above
$ ./_mvn_verify_notests.sh    # no database needed
```

The upstream jars, and their `test-companion` jars of randomizers and persisters, are local `SNAPSHOT`s:
`./mvnw -DskipTests install` in `../oracle-sample-schemas-persistence` first.
