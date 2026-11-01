package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Department;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link DepartmentRepository}.
 */
@AddBeanClasses(DepartmentRepository_.class)
class DepartmentRepository_IT
        extends _Repository_IT<DepartmentRepository, Department, Integer> {

    DepartmentRepository_IT() {
        super(DepartmentRepository.class, Department.class, Integer.class);
    }
}
