package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.OrderItem;
import com.github.jinahya.oracle.sample.persistence.co.OrderItemId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link OrderItemRepository}.
 */
@AddBeanClasses(OrderItemRepository_.class)
class OrderItemRepository_IT
        extends _Repository_IT<OrderItemRepository, OrderItem, OrderItemId> {

    OrderItemRepository_IT() {
        super(OrderItemRepository.class, OrderItem.class, OrderItemId.class);
    }
}
