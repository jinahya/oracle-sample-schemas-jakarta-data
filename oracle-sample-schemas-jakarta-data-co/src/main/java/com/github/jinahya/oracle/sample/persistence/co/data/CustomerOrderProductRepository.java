package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.CustomerOrderProduct;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CustomerOrderProduct}, the {@code CUSTOMER_ORDER_PRODUCTS} view of the {@code CO} schema.
 */
@Repository
public interface CustomerOrderProductRepository
        extends _Repository<CustomerOrderProduct, Long>,
                CrudRepository<CustomerOrderProduct, Long> {

}
