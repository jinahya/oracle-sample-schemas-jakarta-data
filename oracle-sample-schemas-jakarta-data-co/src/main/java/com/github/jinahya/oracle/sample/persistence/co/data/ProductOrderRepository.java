package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.ProductOrder;
import com.github.jinahya.oracle.sample.persistence.co.ProductOrderId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductOrder}, the {@code PRODUCT_ORDERS} view of the {@code CO} schema.
 */
@Repository
public interface ProductOrderRepository
        extends _Repository<ProductOrder, ProductOrderId>,
                CrudRepository<ProductOrder, ProductOrderId> {

}
