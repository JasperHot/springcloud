package com.example.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class EurekaserverApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(EurekaserverApplication.class, args);
        int length = context.getBeanDefinitionNames().length;
        log.info("Spring boot启动初始化了 {} 个 Bean", length);
    }

}
