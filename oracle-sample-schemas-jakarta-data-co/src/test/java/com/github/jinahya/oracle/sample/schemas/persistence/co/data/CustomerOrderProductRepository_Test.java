package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.CustomerOrderProduct;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link CustomerOrderProductRepository}.
 */
@AddBeanClasses(CustomerOrderProductRepository_.class)
class CustomerOrderProductRepository_Test
        extends _Repository_Test<CustomerOrderProductRepository, CustomerOrderProduct, Long> {

    CustomerOrderProductRepository_Test() {
        super(CustomerOrderProductRepository.class, CustomerOrderProduct.class, Long.class);
    }
}
