package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Profit;
import com.github.jinahya.oracle.sample.persistence.sh.ProfitId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link ProfitRepository}.
 */
@AddBeanClasses(ProfitRepository_.class)
class ProfitRepository_Test
        extends _Repository_Test<ProfitRepository, Profit, ProfitId> {

    ProfitRepository_Test() {
        super(ProfitRepository.class, Profit.class, ProfitId.class);
    }
}
