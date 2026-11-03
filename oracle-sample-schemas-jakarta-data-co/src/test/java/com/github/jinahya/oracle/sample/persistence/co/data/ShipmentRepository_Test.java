package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Shipment;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link ShipmentRepository}.
 */
@AddBeanClasses(ShipmentRepository_.class)
class ShipmentRepository_Test
        extends _Repository_Test<ShipmentRepository, Shipment, Long> {

    ShipmentRepository_Test() {
        super(ShipmentRepository.class, Shipment.class, Long.class);
    }
}
