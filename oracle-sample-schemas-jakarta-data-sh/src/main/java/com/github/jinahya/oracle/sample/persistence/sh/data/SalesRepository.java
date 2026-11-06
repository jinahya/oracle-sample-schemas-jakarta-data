package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Sales;
import com.github.jinahya.oracle.sample.persistence.sh.mapped.SalesId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Sales}, the {@code SALES} table of the {@code SH} schema.
 */
@Repository
public interface SalesRepository
        extends _Repository<Sales, SalesId>,
                CrudRepository<Sales, SalesId> {

}
