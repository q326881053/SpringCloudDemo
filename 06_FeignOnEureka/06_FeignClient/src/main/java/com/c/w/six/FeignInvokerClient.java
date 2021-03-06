package com.c.w.six;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author C
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

public class FeignInvokerClient {

    public static void main(String[] args) {
        SpringApplication.run(FeignInvokerClient.class, args);
    }

}
