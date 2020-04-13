package com.example.h2database;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(exclude={DruidDataSourceAutoConfigure.class})
public class SpringBootH2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2Application.class, args);
    }
}
