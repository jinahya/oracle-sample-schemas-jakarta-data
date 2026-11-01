#!/bin/sh
# Runs the unit tests of every module: compile, hibernate-processor generating the metamodel and the repository
# implementations, and the tests against H2 (the `<schema>-test` unit of each module's
# src/test/resources/META-INF/persistence.xml).
#
# Needs no database.
#
# `clean` is deliberate. The processor writes a <Repository>_ class per @Repository interface, and a renamed or
# removed interface leaves its stale implementation under target/generated-sources, which the next compile picks
# up and fails on with "cannot find symbol" -- a failure silent about its cause.
#
# One provider only: EclipseLink 5.0 has no Jakarta Data, so unlike upstream (oracle-sample-schemas-persistence)
# there is no provider profile to name here.
#
# One module: ./_mvn_test.sh -pl oracle-sample-schemas-jakarta-data-hr
cd "$(dirname "$0")" || exit 1

exec ./mvnw clean test "$@"
