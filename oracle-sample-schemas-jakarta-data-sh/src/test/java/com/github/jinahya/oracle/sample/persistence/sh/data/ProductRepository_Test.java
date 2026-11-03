package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Product;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link ProductRepository}.
 */
@AddBeanClasses(ProductRepository_.class)
class ProductRepository_Test
        extends _Repository_Test<ProductRepository, Product, Integer> {

    ProductRepository_Test() {
        super(ProductRepository.class, Product.class, Integer.class);
    }
}
