package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.FweekPscatSalesMv;
import com.github.jinahya.oracle.sample.persistence.sh.mapped.FweekPscatSalesMvId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link FweekPscatSalesMvRepository}.
 */
@AddBeanClasses(FweekPscatSalesMvRepository_.class)
class FweekPscatSalesMvRepository_IT
        extends _Repository_IT<FweekPscatSalesMvRepository, FweekPscatSalesMv, FweekPscatSalesMvId> {

    FweekPscatSalesMvRepository_IT() {
        super(FweekPscatSalesMvRepository.class, FweekPscatSalesMv.class, FweekPscatSalesMvId.class);
    }
}
