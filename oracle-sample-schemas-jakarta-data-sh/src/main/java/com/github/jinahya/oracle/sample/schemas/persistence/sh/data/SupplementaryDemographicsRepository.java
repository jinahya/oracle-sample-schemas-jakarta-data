package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.SupplementaryDemographics;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SupplementaryDemographics}, the {@code SUPPLEMENTARY_DEMOGRAPHICS} table of the
 * {@code SH} schema.
 */
@Repository
public interface SupplementaryDemographicsRepository
        extends _Repository<SupplementaryDemographics, Long>,
                CrudRepository<SupplementaryDemographics, Long> {

}
