package com.mk.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.mk.springdemo")
public class ProjectConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for swim coach AND inject dependency
    @Bean Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
