package com.example.ai.doctor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

public class RestClientConfiguration {
    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }
}
