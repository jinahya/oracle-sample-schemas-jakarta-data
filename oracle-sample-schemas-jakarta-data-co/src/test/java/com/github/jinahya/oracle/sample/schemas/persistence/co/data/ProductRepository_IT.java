package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.Product;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductRepository}.
 */
@AddBeanClasses(ProductRepository_.class)
class ProductRepository_IT
        extends _Repository_IT<ProductRepository, Product, Long> {

    ProductRepository_IT() {
        super(ProductRepository.class, Product.class, Long.class);
    }
}
