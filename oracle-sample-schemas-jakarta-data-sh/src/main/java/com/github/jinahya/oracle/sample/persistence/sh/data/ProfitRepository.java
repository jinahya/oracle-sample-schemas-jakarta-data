package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Profit;
import com.github.jinahya.oracle.sample.persistence.sh.ProfitId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Profit}, the {@code PROFITS} view of the {@code SH} schema.
 */
@Repository
public interface ProfitRepository
        extends _Repository<Profit, ProfitId>,
                CrudRepository<Profit, ProfitId> {

}
