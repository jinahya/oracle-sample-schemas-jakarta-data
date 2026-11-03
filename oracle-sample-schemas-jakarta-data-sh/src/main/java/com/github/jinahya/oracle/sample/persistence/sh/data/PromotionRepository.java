package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Promotion;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Promotion}, the {@code PROMOTIONS} table of the {@code SH} schema.
 */
@Repository
public interface PromotionRepository
        extends _Repository<Promotion, Integer>,
                CrudRepository<Promotion, Integer> {

}
