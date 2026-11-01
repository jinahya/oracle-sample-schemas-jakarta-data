package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Time;
import org.jboss.weld.junit5.auto.AddBeanClasses;

import java.time.LocalDateTime;

/**
 * The integration tests of {@link TimeRepository}.
 */
@AddBeanClasses(TimeRepository_.class)
class TimeRepository_IT
        extends _Repository_IT<TimeRepository, Time, LocalDateTime> {

    TimeRepository_IT() {
        super(TimeRepository.class, Time.class, LocalDateTime.class);
    }
}
