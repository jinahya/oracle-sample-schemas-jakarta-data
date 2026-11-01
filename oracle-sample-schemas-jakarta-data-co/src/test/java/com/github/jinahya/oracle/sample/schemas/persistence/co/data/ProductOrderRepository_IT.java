package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.ProductOrder;
import com.github.jinahya.oracle.sample.schemas.persistence.co.ProductOrderId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductOrderRepository}.
 */
@AddBeanClasses(ProductOrderRepository_.class)
class ProductOrderRepository_IT
        extends _Repository_IT<ProductOrderRepository, ProductOrder, ProductOrderId> {

    ProductOrderRepository_IT() {
        super(ProductOrderRepository.class, ProductOrder.class, ProductOrderId.class);
    }
}
