package org.isegodin.home.registry.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HomeServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeServiceRegistryApplication.class, args);
    }

}
