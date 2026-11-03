package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Product;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Product}, the {@code PRODUCTS} table of the {@code SH} schema.
 */
@Repository
public interface ProductRepository
        extends _Repository<Product, Integer>,
                CrudRepository<Product, Integer> {

}
