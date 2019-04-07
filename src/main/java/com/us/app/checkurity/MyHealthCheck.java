package com.us.app.checkurity;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Udyan Shardhar
 * Api health check
 */
@RestController
@RequestMapping("/api")
public class MyHealthCheck {
    @GetMapping("/health")
    public String ping(Authentication authentication) {
        return authentication != null ? "Secured User" : "Not Secure";
    }
}
