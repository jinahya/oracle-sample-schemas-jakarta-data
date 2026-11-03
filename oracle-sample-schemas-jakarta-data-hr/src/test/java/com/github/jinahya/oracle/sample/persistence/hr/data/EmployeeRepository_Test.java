package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Employee;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link EmployeeRepository}.
 */
@AddBeanClasses(EmployeeRepository_.class)
class EmployeeRepository_Test
        extends _Repository_Test<EmployeeRepository, Employee, Integer> {

    EmployeeRepository_Test() {
        super(EmployeeRepository.class, Employee.class, Integer.class);
    }
}
