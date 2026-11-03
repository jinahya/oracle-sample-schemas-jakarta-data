package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.EmpDetailsView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link EmpDetailsView}, the {@code EMP_DETAILS_VIEW} view of the {@code HR} schema.
 */
@Repository
public interface EmpDetailsViewRepository
        extends _Repository<EmpDetailsView, Integer>,
                CrudRepository<EmpDetailsView, Integer> {

}
