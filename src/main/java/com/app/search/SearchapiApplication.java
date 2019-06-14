package com.app.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.app.service","com.app.controller","com.app.dao"})
@EntityScan("com.app.domain")
@SpringBootApplication
public class SearchapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchapiApplication.class, args);
	}

}
