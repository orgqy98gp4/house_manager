package com.aaa.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.aaa.house.dao")
@EnableEurekaClient
public class HouseMangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseMangerApplication.class, args);
    }

}
