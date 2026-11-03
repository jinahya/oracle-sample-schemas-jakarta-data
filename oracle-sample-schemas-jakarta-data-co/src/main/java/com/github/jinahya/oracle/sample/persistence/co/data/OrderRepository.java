package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Order;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Order}, the {@code ORDERS} table of the {@code CO} schema.
 */
@Repository
public interface OrderRepository
        extends _Repository<Order, Long>,
                CrudRepository<Order, Long> {

}
