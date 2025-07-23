package com.example.cloud_config_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Value("${user.role}")
    private String role;

    @GetMapping(value = "/whoami", produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami() {
        return String.format("Hello! User Role is: %s", role);
    }
}
