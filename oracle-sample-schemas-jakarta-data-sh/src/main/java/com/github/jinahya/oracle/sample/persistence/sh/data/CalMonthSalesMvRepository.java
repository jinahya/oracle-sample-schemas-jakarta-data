package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.CalMonthSalesMv;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CalMonthSalesMv}, the {@code CAL_MONTH_SALES_MV} materialized view of the {@code SH} schema.
 */
@Repository
public interface CalMonthSalesMvRepository
        extends _Repository<CalMonthSalesMv, String>,
                CrudRepository<CalMonthSalesMv, String> {

}
