package com.learning.bgr.ratelimiter;

import com.learning.bgr.ratelimiter.model.RateLimitPlan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RateLimiterService {
    private final RateLimitPlanProvider rateLimitPlanProvider;

    public boolean isRequestAllowed(Long planId) {
        RateLimitPlan rateLimitPlan = rateLimitPlanProvider.getRateLimitPlan(planId);
        return false;
    }

}
