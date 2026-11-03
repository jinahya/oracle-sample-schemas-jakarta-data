package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.Country;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CountryRepository}.
 */
@AddBeanClasses(CountryRepository_.class)
class CountryRepository_IT
        extends _Repository_IT<CountryRepository, Country, String> {

    CountryRepository_IT() {
        super(CountryRepository.class, Country.class, String.class);
    }
}
