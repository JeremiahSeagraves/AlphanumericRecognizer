package com.jeremiahseagraves.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHi() {

        return new ResponseEntity<>(restTemplate.getForObject(
                "http://alphanumeric-recognizer-api/hello/Jeremiah?profession=Software Engineer",
                String.class), HttpStatus.OK);
    }
}
