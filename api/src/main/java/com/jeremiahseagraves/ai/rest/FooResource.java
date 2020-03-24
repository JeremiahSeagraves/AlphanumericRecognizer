package com.jeremiahseagraves.ai.rest;

import com.jeremiahseagraves.ai.feign.FooClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class FooResource {

    private final FooClient fooClient;

    public FooResource(FooClient fooClient) {
        this.fooClient = fooClient;
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(@PathVariable String name, @RequestParam(defaultValue = "professional") String profession) {
        log.info("Entering in say-hello method");
        return ResponseEntity.accepted().contentType(MediaType.APPLICATION_JSON)
                .body("Hi, " + name + ", you're a great " + profession);
    }

    @RequestMapping(value = "/hello-ml-agent/{name}", method = RequestMethod.GET)
    public ResponseEntity<String> sayHelloFromMLAgent(@PathVariable String name, @RequestParam(defaultValue = "professional") String profession) {
        log.info("Entering in say-hello method. Calling feign client");
        return ResponseEntity.accepted().contentType(MediaType.APPLICATION_JSON)
                .body(fooClient.getSalutationFromMLAgent(name, profession));
    }
}
