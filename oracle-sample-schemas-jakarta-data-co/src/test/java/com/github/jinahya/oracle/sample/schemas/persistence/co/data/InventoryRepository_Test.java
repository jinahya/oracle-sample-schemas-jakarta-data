package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.Inventory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link InventoryRepository}.
 */
@AddBeanClasses(InventoryRepository_.class)
class InventoryRepository_Test
        extends _Repository_Test<InventoryRepository, Inventory, Long> {

    InventoryRepository_Test() {
        super(InventoryRepository.class, Inventory.class, Long.class);
    }
}
