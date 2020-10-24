package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.Mapper")
public class Main {
	public static void main(String[] args) {
		System.out.println("我人傻了");
			//springboot启动器
		SpringApplication.run(Main.class, args);
	}
}
