package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Location;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Location}, the {@code LOCATIONS} table of the {@code HR} schema.
 */
@Repository
public interface LocationRepository
        extends _Repository<Location, Integer>,
                CrudRepository<Location, Integer> {

}
