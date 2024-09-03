package com.cq.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories(basePackages = "com.cq.es.repository")
@SpringBootApplication
public class springbootesApplication {
    public static void main(String[] args) {
        SpringApplication.run(springbootesApplication.class);
    }
}
