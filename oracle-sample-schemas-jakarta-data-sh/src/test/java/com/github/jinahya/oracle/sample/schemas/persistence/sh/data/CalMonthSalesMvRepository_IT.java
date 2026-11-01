package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.CalMonthSalesMv;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CalMonthSalesMvRepository}.
 */
@AddBeanClasses(CalMonthSalesMvRepository_.class)
class CalMonthSalesMvRepository_IT
        extends _Repository_IT<CalMonthSalesMvRepository, CalMonthSalesMv, String> {

    CalMonthSalesMvRepository_IT() {
        super(CalMonthSalesMvRepository.class, CalMonthSalesMv.class, String.class);
    }
}
