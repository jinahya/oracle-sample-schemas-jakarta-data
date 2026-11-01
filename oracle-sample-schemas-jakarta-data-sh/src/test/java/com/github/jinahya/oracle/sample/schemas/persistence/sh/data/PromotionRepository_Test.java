package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Promotion;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link PromotionRepository}.
 */
@AddBeanClasses(PromotionRepository_.class)
class PromotionRepository_Test
        extends _Repository_Test<PromotionRepository, Promotion, Integer> {

    PromotionRepository_Test() {
        super(PromotionRepository.class, Promotion.class, Integer.class);
    }
}
