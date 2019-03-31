package com.us.app.checkurity;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHealthCheck {
    @GetMapping("/api/ping")
    public String getPing(Authentication authentication) {
        return "Hello "+ authentication.getName();
    }
}
