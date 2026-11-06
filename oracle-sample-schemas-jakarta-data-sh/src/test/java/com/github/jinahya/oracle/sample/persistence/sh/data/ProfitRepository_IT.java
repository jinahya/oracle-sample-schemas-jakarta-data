package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Profit;
import com.github.jinahya.oracle.sample.persistence.sh.mapped.ProfitId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProfitRepository}.
 */
@AddBeanClasses(ProfitRepository_.class)
class ProfitRepository_IT
        extends _Repository_IT<ProfitRepository, Profit, ProfitId> {

    ProfitRepository_IT() {
        super(ProfitRepository.class, Profit.class, ProfitId.class);
    }
}
