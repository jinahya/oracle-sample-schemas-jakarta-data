package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Department;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Department}, the {@code DEPARTMENTS} table of the {@code HR} schema.
 */
@Repository
public interface DepartmentRepository
        extends _Repository<Department, Integer>,
                CrudRepository<Department, Integer> {

}
