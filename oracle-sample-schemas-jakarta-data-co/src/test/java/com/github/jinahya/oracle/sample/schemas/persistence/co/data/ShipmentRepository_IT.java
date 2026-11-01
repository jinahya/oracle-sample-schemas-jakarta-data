package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.Shipment;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ShipmentRepository}.
 */
@AddBeanClasses(ShipmentRepository_.class)
class ShipmentRepository_IT
        extends _Repository_IT<ShipmentRepository, Shipment, Long> {

    ShipmentRepository_IT() {
        super(ShipmentRepository.class, Shipment.class, Long.class);
    }
}
