package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.SupplementaryDemographics;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SupplementaryDemographicsRepository}.
 */
@AddBeanClasses(SupplementaryDemographicsRepository_.class)
class SupplementaryDemographicsRepository_IT
        extends _Repository_IT<SupplementaryDemographicsRepository, SupplementaryDemographics, Long> {

    SupplementaryDemographicsRepository_IT() {
        super(SupplementaryDemographicsRepository.class, SupplementaryDemographics.class, Long.class);
    }
}
