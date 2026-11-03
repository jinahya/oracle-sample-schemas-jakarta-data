package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Employee;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Employee}, the {@code EMPLOYEES} table of the {@code HR} schema.
 */
@Repository
public interface EmployeeRepository
        extends _Repository<Employee, Integer>,
                CrudRepository<Employee, Integer> {

}
