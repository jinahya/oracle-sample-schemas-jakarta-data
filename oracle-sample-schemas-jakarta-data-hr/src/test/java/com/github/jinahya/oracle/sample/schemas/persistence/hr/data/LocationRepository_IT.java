package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Location;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link LocationRepository}.
 */
@AddBeanClasses(LocationRepository_.class)
class LocationRepository_IT
        extends _Repository_IT<LocationRepository, Location, Integer> {

    LocationRepository_IT() {
        super(LocationRepository.class, Location.class, Integer.class);
    }
}
