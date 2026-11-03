package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.JobHistory;
import com.github.jinahya.oracle.sample.persistence.hr.JobHistoryId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link JobHistory}, the {@code JOB_HISTORY} table of the {@code HR} schema.
 */
@Repository
public interface JobHistoryRepository
        extends _Repository<JobHistory, JobHistoryId>,
                CrudRepository<JobHistory, JobHistoryId> {

}
