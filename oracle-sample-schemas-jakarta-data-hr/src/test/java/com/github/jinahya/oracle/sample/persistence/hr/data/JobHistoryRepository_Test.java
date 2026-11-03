package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.JobHistory;
import com.github.jinahya.oracle.sample.persistence.hr.JobHistoryId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link JobHistoryRepository}.
 */
@AddBeanClasses(JobHistoryRepository_.class)
class JobHistoryRepository_Test
        extends _Repository_Test<JobHistoryRepository, JobHistory, JobHistoryId> {

    JobHistoryRepository_Test() {
        super(JobHistoryRepository.class, JobHistory.class, JobHistoryId.class);
    }
}
