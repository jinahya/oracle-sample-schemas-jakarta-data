package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.Country;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link CountryRepository}.
 */
@AddBeanClasses(CountryRepository_.class)
class CountryRepository_Test
        extends _Repository_Test<CountryRepository, Country, String> {

    CountryRepository_Test() {
        super(CountryRepository.class, Country.class, String.class);
    }
}
