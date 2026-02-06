package com.backend.week1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep(3000);
        return "Hello from port " + port;
    }
    // http://localhost:8081/hello

    @GetMapping("/fast")
    public String fast() {
        return "Fast response from port " + port;
    }

}
