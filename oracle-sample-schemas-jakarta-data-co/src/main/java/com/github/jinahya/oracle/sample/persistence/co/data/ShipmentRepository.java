package com.github.jinahya.oracle.sample.persistence.co.data;

import com.github.jinahya.oracle.sample.persistence.co.Shipment;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Shipment}, the {@code SHIPMENTS} table of the {@code CO} schema.
 */
@Repository
public interface ShipmentRepository
        extends _Repository<Shipment, Long>,
                CrudRepository<Shipment, Long> {

}
