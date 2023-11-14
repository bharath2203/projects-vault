package com.learning.bgr.ratelimiter;

import com.learning.bgr.ratelimiter.model.RateLimitPlan;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class PerPlanRequestHandler {
    private Long planId;
    private Deque<Long> requestTimeStamps;

    public PerPlanRequestHandler(Long planId) {
        this.planId = planId;
        this.requestTimeStamps = new ConcurrentLinkedDeque<>();
    }

    public RateLimitAttributes handleRequest(RateLimitPlan rateLimitPlan) {
        Long currentTimeStamp = System.currentTimeMillis();
        if ((currentTimeStamp - this.requestTimeStamps.peekLast()) >= (1000L * rateLimitPlan.getWindowSizeInSeconds())) {
            return RateLimitAttributes.builder()
                    .remainingRequests(0)
                    .
                    .build();
        }
    }
}
