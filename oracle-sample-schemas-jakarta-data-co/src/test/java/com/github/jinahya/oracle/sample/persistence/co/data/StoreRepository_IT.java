package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Store;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StoreRepository}.
 */
@AddBeanClasses(StoreRepository_.class)
class StoreRepository_IT
        extends _Repository_IT<StoreRepository, Store, Long> {

    StoreRepository_IT() {
        super(StoreRepository.class, Store.class, Long.class);
    }
}
