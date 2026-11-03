package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Country;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Country}, the {@code COUNTRIES} table of the {@code SH} schema.
 */
@Repository
public interface CountryRepository
        extends _Repository<Country, Long>,
                CrudRepository<Country, Long> {

}
