package com.ashcr.mptc.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping("/healthcheck")
    public String healthCheck() {
        return "Health check ok!";
    }
    
}
