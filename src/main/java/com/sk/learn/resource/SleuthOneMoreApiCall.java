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
 * Created by skumar47 on 2/6/2017.
 */
@RestController
@RequestMapping("/leaves")
@Slf4j
public class SleuthOneMoreApiCall {

    private static final Logger logger = Logger.getLogger(SleuthResource.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String leaves() {
        logger.log(Level.INFO, "you are asking to trace the request in the leaves");
        restTemplate.getForObject("http://localhost:8086/leaves/root", String.class);
        return "Check logs to get the trace Id and span Id";
    }

    @GetMapping("root")
    public String root() {
        logger.log(Level.INFO, "you are asking to trace the request in the root");
        return "Check logs to get the trace Id and span Id";
    }

}
