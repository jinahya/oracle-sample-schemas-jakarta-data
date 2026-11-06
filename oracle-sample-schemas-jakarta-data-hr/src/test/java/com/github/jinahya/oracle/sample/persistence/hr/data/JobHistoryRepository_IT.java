package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.JobHistory;
import com.github.jinahya.oracle.sample.persistence.hr.mapped.JobHistoryId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link JobHistoryRepository}.
 */
@AddBeanClasses(JobHistoryRepository_.class)
class JobHistoryRepository_IT
        extends _Repository_IT<JobHistoryRepository, JobHistory, JobHistoryId> {

    JobHistoryRepository_IT() {
        super(JobHistoryRepository.class, JobHistory.class, JobHistoryId.class);
    }
}
