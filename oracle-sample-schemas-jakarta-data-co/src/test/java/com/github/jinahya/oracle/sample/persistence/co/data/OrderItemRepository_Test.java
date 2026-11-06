package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.OrderItem;
import com.github.jinahya.oracle.sample.persistence.co.mapped.OrderItemId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link OrderItemRepository}.
 */
@AddBeanClasses(OrderItemRepository_.class)
class OrderItemRepository_Test
        extends _Repository_Test<OrderItemRepository, OrderItem, OrderItemId> {

    OrderItemRepository_Test() {
        super(OrderItemRepository.class, OrderItem.class, OrderItemId.class);
    }
}
