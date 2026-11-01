package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Cost;
import com.github.jinahya.oracle.sample.schemas.persistence.sh.CostId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link CostRepository}.
 */
@AddBeanClasses(CostRepository_.class)
class CostRepository_Test
        extends _Repository_Test<CostRepository, Cost, CostId> {

    CostRepository_Test() {
        super(CostRepository.class, Cost.class, CostId.class);
    }
}
