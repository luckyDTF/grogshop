package com.cairne.grogshop;

import com.cairne.grogshop.common.config.DruidDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DruidDataSourceConfig.class)
public class GrogshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrogshopApplication.class, args);
    }

}
