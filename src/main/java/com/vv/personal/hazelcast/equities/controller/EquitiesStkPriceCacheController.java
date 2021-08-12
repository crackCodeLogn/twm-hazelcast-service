package com.vv.personal.hazelcast.equities.controller;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.vv.personal.hazelcast.equities.config.EquitiesHazelCastConfig;
import com.vv.personal.hazelcast.equities.constants.EquitiesStkPriceCacheConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
@RequestMapping("/cache/eq")
public class EquitiesStkPriceCacheController {

    @Inject
    HazelcastInstance hazelcastInstance;

    @Inject
    EquitiesHazelCastConfig equitiesHazelCastConfig;

    private IMap<String, Double> retrieveStkPrice() {
        return hazelcastInstance.getMap(EquitiesStkPriceCacheConstants.HAZELCAST_STK_PRICE_MAP_KEY);
    }

    @GetMapping("/get")
    public Double get(@RequestParam(value = "stk") String stk) {
        return retrieveStkPrice().getOrDefault(stk, EquitiesStkPriceCacheConstants.DEFAULT_STK_PRICE);
    }

    @PostMapping("/put")
    public void put(@RequestParam(value = "stk") String stk,
                    @RequestParam(value = "price") Double price) {
        log.debug("Writing {} x {} to cache!", stk, price);
        retrieveStkPrice().put(stk, price, equitiesHazelCastConfig.stkPriceTtl(), TimeUnit.SECONDS);
    }

    @GetMapping("/greeting")
    public String hello() {
        return "Hello Spring";
    }
}
