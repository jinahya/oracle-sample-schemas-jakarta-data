package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Customer;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Customer}, the {@code CUSTOMERS} table of the {@code SH} schema.
 */
@Repository
public interface CustomerRepository
        extends _Repository<Customer, Long>,
                CrudRepository<Customer, Long> {

}
