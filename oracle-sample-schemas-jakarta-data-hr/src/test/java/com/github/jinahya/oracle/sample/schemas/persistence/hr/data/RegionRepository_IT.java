package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Region;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link RegionRepository}.
 */
@AddBeanClasses(RegionRepository_.class)
class RegionRepository_IT
        extends _Repository_IT<RegionRepository, Region, Long> {

    RegionRepository_IT() {
        super(RegionRepository.class, Region.class, Long.class);
    }
}
