package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Department;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link DepartmentRepository}.
 */
@AddBeanClasses(DepartmentRepository_.class)
class DepartmentRepository_Test
        extends _Repository_Test<DepartmentRepository, Department, Integer> {

    DepartmentRepository_Test() {
        super(DepartmentRepository.class, Department.class, Integer.class);
    }
}
