package com.vv.personal.hazelcast.equities.config;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "eq.hazelcast")
public interface EquitiesHazelCastConfig {
    Integer stkPriceTtl();
}
