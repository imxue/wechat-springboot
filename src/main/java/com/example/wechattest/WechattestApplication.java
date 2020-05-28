package com.example.wechattest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

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

//	public static void main(String[] args) {
//		SpringApplication.run(WechattestApplication.class, args);
//	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}

}
