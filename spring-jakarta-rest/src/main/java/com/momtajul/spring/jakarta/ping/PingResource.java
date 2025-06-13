package com.momtajul.spring.jakarta.ping;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Path("ping")
public class PingResource {

    @GET
    public String ping(){
        return "Pong at " + LocalDateTime.now().toString();
    }
}
