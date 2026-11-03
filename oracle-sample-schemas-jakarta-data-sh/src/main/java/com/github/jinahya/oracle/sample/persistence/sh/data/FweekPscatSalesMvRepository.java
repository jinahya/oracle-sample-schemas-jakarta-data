package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.FweekPscatSalesMv;
import com.github.jinahya.oracle.sample.persistence.sh.FweekPscatSalesMvId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link FweekPscatSalesMv}, the {@code FWEEK_PSCAT_SALES_MV} materialized view of the
 * {@code SH} schema.
 */
@Repository
public interface FweekPscatSalesMvRepository
        extends _Repository<FweekPscatSalesMv, FweekPscatSalesMvId>,
                CrudRepository<FweekPscatSalesMv, FweekPscatSalesMvId> {

}
