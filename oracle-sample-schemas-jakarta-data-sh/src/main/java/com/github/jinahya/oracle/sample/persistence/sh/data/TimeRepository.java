package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Time;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

import java.time.LocalDateTime;

/**
 * A repository for {@link Time}, the {@code TIMES} table of the {@code SH} schema.
 */
@Repository
public interface TimeRepository
        extends _Repository<Time, LocalDateTime>,
                CrudRepository<Time, LocalDateTime> {

}
