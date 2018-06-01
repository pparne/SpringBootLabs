package io.pivotal.workshop.propertyfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${custom.message}")
    private String customMessage;

    @Value("${message}")
    private String message;

    @GetMapping("/")
    public String greeting() {
        return message;
    }

    @GetMapping("/custom")
    public String customGreeting() {
        return customMessage;
    }
}
