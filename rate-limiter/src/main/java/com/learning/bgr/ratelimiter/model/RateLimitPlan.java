package com.learning.bgr.ratelimiter.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RateLimitPlan {
    // Denotes the key which will be used to store the rate limit plan in redis
    private Long id;
    private Long requestsLimit;
    private Long windowSizeInSeconds;
}
