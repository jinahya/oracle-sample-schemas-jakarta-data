package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Customer;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CustomerRepository}.
 */
@AddBeanClasses(CustomerRepository_.class)
class CustomerRepository_IT
        extends _Repository_IT<CustomerRepository, Customer, Long> {

    CustomerRepository_IT() {
        super(CustomerRepository.class, Customer.class, Long.class);
    }
}
