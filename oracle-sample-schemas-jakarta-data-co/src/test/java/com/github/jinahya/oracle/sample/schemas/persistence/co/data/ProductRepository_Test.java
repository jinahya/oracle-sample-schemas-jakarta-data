package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.Product;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link ProductRepository}.
 */
@AddBeanClasses(ProductRepository_.class)
class ProductRepository_Test
        extends _Repository_Test<ProductRepository, Product, Long> {

    ProductRepository_Test() {
        super(ProductRepository.class, Product.class, Long.class);
    }
}
