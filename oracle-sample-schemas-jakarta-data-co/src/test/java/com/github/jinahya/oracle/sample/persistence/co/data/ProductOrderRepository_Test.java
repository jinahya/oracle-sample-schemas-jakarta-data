package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.ProductOrder;
import com.github.jinahya.oracle.sample.persistence.co.mapped.ProductOrderId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link ProductOrderRepository}.
 */
@AddBeanClasses(ProductOrderRepository_.class)
class ProductOrderRepository_Test
        extends _Repository_Test<ProductOrderRepository, ProductOrder, ProductOrderId> {

    ProductOrderRepository_Test() {
        super(ProductOrderRepository.class, ProductOrder.class, ProductOrderId.class);
    }
}
