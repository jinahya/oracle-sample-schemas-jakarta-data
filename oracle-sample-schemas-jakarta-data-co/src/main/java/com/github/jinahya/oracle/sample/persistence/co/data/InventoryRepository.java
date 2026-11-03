package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Inventory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Inventory}, the {@code INVENTORY} table of the {@code CO} schema.
 */
@Repository
public interface InventoryRepository
        extends _Repository<Inventory, Long>,
                CrudRepository<Inventory, Long> {

}
