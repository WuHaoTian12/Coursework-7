package com.gym1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Date;
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@MapperScan("com.gym1.mapper")
@ServletComponentScan(basePackages = "com.gym1.util")
public class GymUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(GymUserApplication.class, args);
    }
}
