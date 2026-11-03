package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Region;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Region}, the {@code REGIONS} table of the {@code HR} schema.
 */
@Repository
public interface RegionRepository
        extends _Repository<Region, Long>,
                CrudRepository<Region, Long> {

}
