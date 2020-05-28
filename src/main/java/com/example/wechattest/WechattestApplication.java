package com.example.wechattest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

@SpringBootApplication
@EnableSwagger2
//开启定时任务
//@EnableScheduling
@ComponentScan(value = {"com"})
@MapperScan(value = {"com.example.wechattest.Mapper"})
public class WechattestApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WechattestApplication.class, args);
	}

}
