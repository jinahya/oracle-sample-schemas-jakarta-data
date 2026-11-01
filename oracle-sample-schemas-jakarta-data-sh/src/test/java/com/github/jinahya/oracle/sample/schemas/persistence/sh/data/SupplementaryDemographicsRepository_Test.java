package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.SupplementaryDemographics;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link SupplementaryDemographicsRepository}.
 */
@AddBeanClasses(SupplementaryDemographicsRepository_.class)
class SupplementaryDemographicsRepository_Test
        extends _Repository_Test<SupplementaryDemographicsRepository, SupplementaryDemographics, Long> {

    SupplementaryDemographicsRepository_Test() {
        super(SupplementaryDemographicsRepository.class, SupplementaryDemographics.class, Long.class);
    }
}
