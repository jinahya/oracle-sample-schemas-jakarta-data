package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Customer;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link CustomerRepository}.
 */
@AddBeanClasses(CustomerRepository_.class)
class CustomerRepository_Test
        extends _Repository_Test<CustomerRepository, Customer, Long> {

    CustomerRepository_Test() {
        super(CustomerRepository.class, Customer.class, Long.class);
    }
}
