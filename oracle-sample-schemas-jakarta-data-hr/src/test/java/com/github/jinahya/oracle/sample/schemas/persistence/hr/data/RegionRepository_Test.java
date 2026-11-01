package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Region;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link RegionRepository}.
 */
@AddBeanClasses(RegionRepository_.class)
class RegionRepository_Test
        extends _Repository_Test<RegionRepository, Region, Long> {

    RegionRepository_Test() {
        super(RegionRepository.class, Region.class, Long.class);
    }
}
