package com.sk.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringSleuthApplication {

	private static final Logger LOG = Logger.getLogger(SpringSleuthApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(SpringSleuthApplication.class, args);
	}

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }


}
