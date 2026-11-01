package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Promotion;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PromotionRepository}.
 */
@AddBeanClasses(PromotionRepository_.class)
class PromotionRepository_IT
        extends _Repository_IT<PromotionRepository, Promotion, Integer> {

    PromotionRepository_IT() {
        super(PromotionRepository.class, Promotion.class, Integer.class);
    }
}
