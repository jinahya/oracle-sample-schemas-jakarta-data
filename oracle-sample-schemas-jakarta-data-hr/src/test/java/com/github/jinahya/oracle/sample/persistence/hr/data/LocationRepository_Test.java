package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Location;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link LocationRepository}.
 */
@AddBeanClasses(LocationRepository_.class)
class LocationRepository_Test
        extends _Repository_Test<LocationRepository, Location, Integer> {

    LocationRepository_Test() {
        super(LocationRepository.class, Location.class, Integer.class);
    }
}
