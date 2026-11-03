package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Order;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link OrderRepository}.
 */
@AddBeanClasses(OrderRepository_.class)
class OrderRepository_Test
        extends _Repository_Test<OrderRepository, Order, Long> {

    OrderRepository_Test() {
        super(OrderRepository.class, Order.class, Long.class);
    }
}
