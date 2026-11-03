package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Country;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Country}, the {@code COUNTRIES} table of the {@code HR} schema.
 */
@Repository
public interface CountryRepository
        extends _Repository<Country, String>,
                CrudRepository<Country, String> {

}
