package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Cost;
import com.github.jinahya.oracle.sample.persistence.sh.mapped.CostId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Cost}, the {@code COSTS} table of the {@code SH} schema.
 */
@Repository
public interface CostRepository
        extends _Repository<Cost, CostId>,
                CrudRepository<Cost, CostId> {

}
