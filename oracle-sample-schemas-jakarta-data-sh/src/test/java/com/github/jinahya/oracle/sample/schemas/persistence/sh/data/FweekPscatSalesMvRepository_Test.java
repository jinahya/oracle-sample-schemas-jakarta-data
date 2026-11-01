package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.FweekPscatSalesMv;
import com.github.jinahya.oracle.sample.schemas.persistence.sh.FweekPscatSalesMvId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link FweekPscatSalesMvRepository}.
 */
@AddBeanClasses(FweekPscatSalesMvRepository_.class)
class FweekPscatSalesMvRepository_Test
        extends _Repository_Test<FweekPscatSalesMvRepository, FweekPscatSalesMv, FweekPscatSalesMvId> {

    FweekPscatSalesMvRepository_Test() {
        super(FweekPscatSalesMvRepository.class, FweekPscatSalesMv.class, FweekPscatSalesMvId.class);
    }
}
