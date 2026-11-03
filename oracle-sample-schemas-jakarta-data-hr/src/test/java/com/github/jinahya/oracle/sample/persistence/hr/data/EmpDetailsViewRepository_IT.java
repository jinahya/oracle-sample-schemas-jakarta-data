package com.github.jinahya.oracle.sample.persistence.hr.data;

import com.github.jinahya.oracle.sample.persistence.hr.EmpDetailsView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmpDetailsViewRepository}.
 */
@AddBeanClasses(EmpDetailsViewRepository_.class)
class EmpDetailsViewRepository_IT
        extends _Repository_IT<EmpDetailsViewRepository, EmpDetailsView, Integer> {

    EmpDetailsViewRepository_IT() {
        super(EmpDetailsViewRepository.class, EmpDetailsView.class, Integer.class);
    }
}
