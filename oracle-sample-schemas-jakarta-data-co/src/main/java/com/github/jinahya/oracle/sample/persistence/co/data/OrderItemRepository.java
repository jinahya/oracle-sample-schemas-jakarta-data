package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.OrderItem;
import com.github.jinahya.oracle.sample.persistence.co.OrderItemId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link OrderItem}, the {@code ORDER_ITEMS} table of the {@code CO} schema.
 */
@Repository
public interface OrderItemRepository
        extends _Repository<OrderItem, OrderItemId>,
                CrudRepository<OrderItem, OrderItemId> {

}
