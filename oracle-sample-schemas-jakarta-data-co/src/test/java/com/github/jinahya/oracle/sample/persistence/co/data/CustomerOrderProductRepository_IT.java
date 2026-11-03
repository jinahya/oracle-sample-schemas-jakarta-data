package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.CustomerOrderProduct;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CustomerOrderProductRepository}.
 */
@AddBeanClasses(CustomerOrderProductRepository_.class)
class CustomerOrderProductRepository_IT
        extends _Repository_IT<CustomerOrderProductRepository, CustomerOrderProduct, Long> {

    CustomerOrderProductRepository_IT() {
        super(CustomerOrderProductRepository.class, CustomerOrderProduct.class, Long.class);
    }
}
