package com.stenden.config;

import com.stenden.model.Processor;
import com.stenden.model.impl.LoggerMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ron on 24/11/2016.
 */
@Configuration
@ComponentScan
public class Config {

    @Bean
    public LoggerMessage loggerMessage() {
        return new LoggerMessage();
    }

    @Bean
    public Processor processor() {
        return new Processor();
    }


}
