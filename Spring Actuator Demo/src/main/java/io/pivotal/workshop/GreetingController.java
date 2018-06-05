package io.pivotal.workshop;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final MeterRegistry meterRegistry;

    public GreetingController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @RequestMapping("/hello")
    public String hello() {
        meterRegistry.counter("greetingInvoked").increment();
        return "Hello World!!";
    }
}
