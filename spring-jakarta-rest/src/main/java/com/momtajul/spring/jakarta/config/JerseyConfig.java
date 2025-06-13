package com.momtajul.spring.jakarta.config;

import com.momtajul.spring.jakarta.customer.CustomerResource;
import com.momtajul.spring.jakarta.ping.PingResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import java.security.GeneralSecurityException;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(CustomerResource.class);
        register(PingResource.class);
        register(GeneralSecurityException.class);
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }

}
