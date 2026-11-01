package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Product;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductRepository}.
 */
@AddBeanClasses(ProductRepository_.class)
class ProductRepository_IT
        extends _Repository_IT<ProductRepository, Product, Integer> {

    ProductRepository_IT() {
        super(ProductRepository.class, Product.class, Integer.class);
    }
}
