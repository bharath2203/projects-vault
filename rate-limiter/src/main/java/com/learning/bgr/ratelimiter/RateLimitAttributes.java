package com.learning.bgr.ratelimiter;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RateLimitAttributes {
    private Long remainingRequests;
    private Long retryAfterInSeconds;
    private Long requestWaitTime;
}
