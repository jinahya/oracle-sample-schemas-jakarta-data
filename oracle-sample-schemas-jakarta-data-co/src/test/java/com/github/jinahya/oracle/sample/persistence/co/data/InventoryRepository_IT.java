package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Inventory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link InventoryRepository}.
 */
@AddBeanClasses(InventoryRepository_.class)
class InventoryRepository_IT
        extends _Repository_IT<InventoryRepository, Inventory, Long> {

    InventoryRepository_IT() {
        super(InventoryRepository.class, Inventory.class, Long.class);
    }
}
