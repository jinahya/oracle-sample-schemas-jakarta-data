package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Job;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link JobRepository}.
 */
@AddBeanClasses(JobRepository_.class)
class JobRepository_Test
        extends _Repository_Test<JobRepository, Job, String> {

    JobRepository_Test() {
        super(JobRepository.class, Job.class, String.class);
    }
}
