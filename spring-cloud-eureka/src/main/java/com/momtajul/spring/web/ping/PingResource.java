package com.momtajul.spring.web.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("ping")
public class PingResource {

    @GetMapping
    public String ping(){
        return "Pong at " + LocalDateTime.now().toString();
    }
}
