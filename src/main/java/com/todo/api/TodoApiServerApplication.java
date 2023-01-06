package com.todo.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.todo.api.dao")
public class TodoApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApiServerApplication.class, args);
	}

}
