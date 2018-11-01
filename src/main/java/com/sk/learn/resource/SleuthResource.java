package com.sk.learn.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by sk on 05/02/17.
 */
@RestController
@RequestMapping("/tree")
@Slf4j
public class SleuthResource {

    private static final Logger logger = Logger.getLogger(SleuthResource.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String tree() {
        logger.log(Level.INFO, "you are asking to trace the request in the tree");
        restTemplate.getForObject("http://localhost:8086/subTree", String.class);
        return "Check logs to get the trace Id and span Id";
    }


    @PostMapping
    public String test(@RequestBody String test, @PathVariable("id") String id, BindingResult bindingResult) {
        return test;
    }


}
