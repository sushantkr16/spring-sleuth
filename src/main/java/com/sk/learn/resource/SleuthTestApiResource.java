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
@RequestMapping("/span")
@Slf4j
public class SleuthTestApiResource {

    private static final Logger logger = Logger.getLogger(SleuthResource.class.getName());



    @GetMapping
    public String home() {
        logger.log(Level.INFO, "trace is trying to get the span id");
        return "logged the span id";
    }


}
