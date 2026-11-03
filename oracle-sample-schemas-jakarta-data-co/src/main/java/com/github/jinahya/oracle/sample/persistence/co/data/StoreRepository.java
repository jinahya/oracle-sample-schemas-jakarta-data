package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Store;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Store}, the {@code STORES} table of the {@code CO} schema.
 */
@Repository
public interface StoreRepository
        extends _Repository<Store, Long>,
                CrudRepository<Store, Long> {

}
