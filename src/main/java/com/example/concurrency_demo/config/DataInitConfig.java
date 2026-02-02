package com.example.concurrency_demo.config;

import com.example.concurrency_demo.model.ClientColorState;
import com.example.concurrency_demo.model.Color;
import com.example.concurrency_demo.repository.ClientColorStateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitConfig {

    @Bean
    CommandLineRunner init(ClientColorStateRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.save(new ClientColorState(1L, Color.BLUE));
            }
        };
    }
}
