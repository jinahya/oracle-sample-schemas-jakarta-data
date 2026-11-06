package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Cost;
import com.github.jinahya.oracle.sample.persistence.sh.mapped.CostId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CostRepository}.
 */
@AddBeanClasses(CostRepository_.class)
class CostRepository_IT
        extends _Repository_IT<CostRepository, Cost, CostId> {

    CostRepository_IT() {
        super(CostRepository.class, Cost.class, CostId.class);
    }
}
