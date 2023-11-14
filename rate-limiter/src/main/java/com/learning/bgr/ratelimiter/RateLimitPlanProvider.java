package com.learning.bgr.ratelimiter;

import com.learning.bgr.ratelimiter.model.RateLimitPlan;
import com.learning.bgr.ratelimiter.repository.RateLimitPlanRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class RateLimitPlanProvider {
    private final RateLimitPlanRepository rateLimitPlanRepository;

    public RateLimitPlanProvider(RateLimitPlanRepository rateLimitPlanRepository) {
        this.rateLimitPlanRepository = rateLimitPlanRepository;
    }

    public RateLimitPlan getRateLimitPlan(Long id) {
        return rateLimitPlanRepository.getRateLimitPlan(id);
    }

    public RateLimitPlan createPlan(Long id, Long requestsLimit, Long windowSizeInSeconds) {
        return rateLimitPlanRepository.createPlan(
            RateLimitPlan.builder()
                .id(id)
                .requestsLimit(requestsLimit)
                .windowSizeInSeconds(windowSizeInSeconds)
                .build()
        );
    }
}
