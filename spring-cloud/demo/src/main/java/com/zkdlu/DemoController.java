package com.zkdlu;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/success")
    public String success() {
        return demoService.success();
    }

    @GetMapping("/fail")
    public String fail() {
        return demoService.fail();
    }

    @GetMapping("/retry")
    public String retry() {
        return demoService.retry();
    }
}
