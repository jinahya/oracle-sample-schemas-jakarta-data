package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Order;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link OrderRepository}.
 */
@AddBeanClasses(OrderRepository_.class)
class OrderRepository_IT
        extends _Repository_IT<OrderRepository, Order, Long> {

    OrderRepository_IT() {
        super(OrderRepository.class, Order.class, Long.class);
    }
}
