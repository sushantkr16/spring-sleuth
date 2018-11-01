package com.sk.learn.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by sk on 05/02/17.
 */
@RestController
@RequestMapping("/subTree")
@Slf4j
public class SleuthTestApiResource {

    private static final Logger logger = Logger.getLogger(SleuthResource.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String subTree() {
        logger.log(Level.INFO, "you are asking to trace the request in the sub tree");
        restTemplate.getForObject("http://localhost:8086/leaves", String.class);
        return "Check logs to get the trace Id and span Id";
    }
}
