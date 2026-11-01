package com.github.jinahya.oracle.sample.schemas.persistence.sh.data;

import com.github.jinahya.oracle.sample.schemas.persistence.sh.Channel;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ChannelRepository}.
 */
@AddBeanClasses(ChannelRepository_.class)
class ChannelRepository_IT
        extends _Repository_IT<ChannelRepository, Channel, Long> {

    ChannelRepository_IT() {
        super(ChannelRepository.class, Channel.class, Long.class);
    }
}
