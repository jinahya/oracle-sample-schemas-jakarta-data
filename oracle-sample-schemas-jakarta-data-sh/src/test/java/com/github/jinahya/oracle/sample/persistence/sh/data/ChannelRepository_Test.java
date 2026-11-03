package com.github.jinahya.oracle.sample.persistence.sh.data;

import com.github.jinahya.oracle.sample.persistence.sh.Channel;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The unit tests of {@link ChannelRepository}.
 */
@AddBeanClasses(ChannelRepository_.class)
class ChannelRepository_Test
        extends _Repository_Test<ChannelRepository, Channel, Long> {

    ChannelRepository_Test() {
        super(ChannelRepository.class, Channel.class, Long.class);
    }
}
