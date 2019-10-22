package com.gx;

import com.gx.config.CharsetConfig;
import com.gx.config.DruidDataSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DruidDataSourceConfig.class, CharsetConfig.class})
@MapperScan(basePackages = {"com.gx.dao"})
public class GrogshopApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GrogshopApplication.class).web(true).run(args);
    }

}
