package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Product;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Product}, the {@code PRODUCTS} table of the {@code CO} schema.
 */
@Repository
public interface ProductRepository
        extends _Repository<Product, Long>,
                CrudRepository<Product, Long> {

}
