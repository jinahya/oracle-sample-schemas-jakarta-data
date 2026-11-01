package com.github.jinahya.oracle.sample.schemas.persistence.co.data;

import com.github.jinahya.oracle.sample.schemas.persistence.co.Customer;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Customer}, the {@code CUSTOMERS} table of the {@code CO} schema.
 */
@Repository
public interface CustomerRepository
        extends _Repository<Customer, Long>,
                CrudRepository<Customer, Long> {

}
