package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Channel;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Channel}, the {@code CHANNELS} table of the {@code SH} schema.
 */
@Repository
public interface ChannelRepository
        extends _Repository<Channel, Long>,
                CrudRepository<Channel, Long> {

}
