package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.CalMonthSalesMv;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link CalMonthSalesMvRepository}.
 */
@AddBeanClasses(CalMonthSalesMvRepository_.class)
class CalMonthSalesMvRepository_Test
        extends _Repository_Test<CalMonthSalesMvRepository, CalMonthSalesMv, String> {

    CalMonthSalesMvRepository_Test() {
        super(CalMonthSalesMvRepository.class, CalMonthSalesMv.class, String.class);
    }
}
