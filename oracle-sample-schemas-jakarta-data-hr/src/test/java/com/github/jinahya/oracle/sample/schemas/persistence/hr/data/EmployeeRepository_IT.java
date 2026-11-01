package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Employee;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmployeeRepository}.
 */
@AddBeanClasses(EmployeeRepository_.class)
class EmployeeRepository_IT
        extends _Repository_IT<EmployeeRepository, Employee, Integer> {

    EmployeeRepository_IT() {
        super(EmployeeRepository.class, Employee.class, Integer.class);
    }
}
