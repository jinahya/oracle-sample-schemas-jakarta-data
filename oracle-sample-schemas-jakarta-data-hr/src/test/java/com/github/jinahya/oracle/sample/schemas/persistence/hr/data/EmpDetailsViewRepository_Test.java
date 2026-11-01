package com.github.jinahya.oracle.sample.schemas.persistence.hr.data;

import com.github.jinahya.oracle.sample.schemas.persistence.hr.EmpDetailsView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link EmpDetailsViewRepository}.
 */
@AddBeanClasses(EmpDetailsViewRepository_.class)
class EmpDetailsViewRepository_Test
        extends _Repository_Test<EmpDetailsViewRepository, EmpDetailsView, Integer> {

    EmpDetailsViewRepository_Test() {
        super(EmpDetailsViewRepository.class, EmpDetailsView.class, Integer.class);
    }
}
