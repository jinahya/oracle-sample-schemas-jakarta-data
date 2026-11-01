package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Sales;
import com.github.jinahya.oracle.sample.schemas.persistence.sh.SalesId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link SalesRepository}.
 */
@AddBeanClasses(SalesRepository_.class)
class SalesRepository_Test
        extends _Repository_Test<SalesRepository, Sales, SalesId> {

    SalesRepository_Test() {
        super(SalesRepository.class, Sales.class, SalesId.class);
    }
}
