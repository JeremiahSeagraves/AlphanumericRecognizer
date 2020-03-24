package com.jeremiahseagraves.ai.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ml-agent")
public interface FooClient {

    @GetMapping("/hello/{name}")
    String getSalutationFromMLAgent(@PathVariable String name, @RequestParam String profession);
}
