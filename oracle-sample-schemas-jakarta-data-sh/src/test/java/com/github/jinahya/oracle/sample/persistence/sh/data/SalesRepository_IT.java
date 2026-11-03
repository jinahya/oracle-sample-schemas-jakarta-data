package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Sales;
import com.github.jinahya.oracle.sample.persistence.sh.SalesId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesRepository}.
 */
@AddBeanClasses(SalesRepository_.class)
class SalesRepository_IT
        extends _Repository_IT<SalesRepository, Sales, SalesId> {

    SalesRepository_IT() {
        super(SalesRepository.class, Sales.class, SalesId.class);
    }
}
