package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.Store;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link StoreRepository}.
 */
@AddBeanClasses(StoreRepository_.class)
class StoreRepository_Test
        extends _Repository_Test<StoreRepository, Store, Long> {

    StoreRepository_Test() {
        super(StoreRepository.class, Store.class, Long.class);
    }
}
