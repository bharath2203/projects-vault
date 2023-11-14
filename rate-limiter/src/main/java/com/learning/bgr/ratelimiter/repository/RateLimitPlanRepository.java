package com.learning.bgr.ratelimiter.repository;

import com.learning.bgr.ratelimiter.model.RateLimitPlan;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RateLimitPlanRepository {
    private Map<Long, RateLimitPlan> rateLimitPlanMap;
    public RateLimitPlanRepository() {
        this.rateLimitPlanMap = new HashMap<>();
    }
    public RateLimitPlan getRateLimitPlan(Long id) {
        return rateLimitPlanMap.get(id);
    }
    public RateLimitPlan createPlan(RateLimitPlan rateLimitPlan) {
        rateLimitPlanMap.put(rateLimitPlan.getId(), rateLimitPlan);
        return rateLimitPlan;
    }
}
