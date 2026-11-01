package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Time;
import org.jboss.weld.junit5.auto.AddBeanClasses;

import java.time.LocalDateTime;

/**
 * The unit tests of {@link TimeRepository}.
 */
@AddBeanClasses(TimeRepository_.class)
class TimeRepository_Test
        extends _Repository_Test<TimeRepository, Time, LocalDateTime> {

    TimeRepository_Test() {
        super(TimeRepository.class, Time.class, LocalDateTime.class);
    }
}
