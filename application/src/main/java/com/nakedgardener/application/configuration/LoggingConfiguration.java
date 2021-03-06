package com.nakedgardener.application.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingConfiguration {

    @Bean
    public Logger applicationErrorLog() {
        return LoggerFactory.getLogger("com.nakedgardener.logging.error");
    }
}
