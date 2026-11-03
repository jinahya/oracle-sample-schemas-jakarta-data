package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Job;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link JobRepository}.
 */
@AddBeanClasses(JobRepository_.class)
class JobRepository_IT
        extends _Repository_IT<JobRepository, Job, String> {

    JobRepository_IT() {
        super(JobRepository.class, Job.class, String.class);
    }
}
