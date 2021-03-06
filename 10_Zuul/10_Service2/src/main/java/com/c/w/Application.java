package com.c.w;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).properties("server.port=9002").run(args);
    }

}
