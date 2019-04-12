package com.xzc.stock.download.core.logic.readfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ReadFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadFileApplication.class, args);
	}
	
	@Bean
    @LoadBalanced
    RestOperations restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Autowired
    RestOperations restTemplate;
}
