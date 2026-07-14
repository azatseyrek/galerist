package com.azatseyrek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.azatseyrek"})
@EntityScan(basePackages = {"com.azatseyrek"})
public class GaleristApplication {

    public static void main(String[] args) {
        SpringApplication.run(GaleristApplication.class, args);
    }

}
