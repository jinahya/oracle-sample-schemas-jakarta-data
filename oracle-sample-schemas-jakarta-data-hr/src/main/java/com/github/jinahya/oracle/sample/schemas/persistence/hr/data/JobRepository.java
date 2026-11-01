package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Job;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Job}, the {@code JOBS} table of the {@code HR} schema.
 */
@Repository
public interface JobRepository
        extends _Repository<Job, String>,
                CrudRepository<Job, String> {

}
