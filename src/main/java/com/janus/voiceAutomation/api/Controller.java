package com.janus.voiceAutomation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/hello")
    String hello() {
        return "Hello, World!";
    }

    @PutMapping("/update")
    void update(@RequestBody String data) {
        System.out.println("Received data: " + data);
    }
}
