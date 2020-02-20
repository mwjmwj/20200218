package com.cp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.cp.dao")
@EnableScheduling
public class FlcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlcpApplication.class, args);
    }

}
