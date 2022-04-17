package io.nklkarthi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyRepository getRepository() {
        return new MyRepository();
    }

    @Bean
    public MyService getService() {
        return new MyService(getRepository());
    }

}