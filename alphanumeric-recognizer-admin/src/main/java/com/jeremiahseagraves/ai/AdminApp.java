package com.jeremiahseagraves.ai;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class AdminApp {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminApp.class)
                .web(WebApplicationType.REACTIVE)
                .run(args);
    }
}
