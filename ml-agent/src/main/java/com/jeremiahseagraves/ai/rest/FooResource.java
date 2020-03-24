package com.jeremiahseagraves.ai.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class FooResource {

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String name, @RequestParam(defaultValue = "professional") String profession) {
        log.info("Entering in say-hello method");
        return "Hi, " + name + ", you called ML-Agent with a feign client." + " You're a great " + profession;
    }
}
