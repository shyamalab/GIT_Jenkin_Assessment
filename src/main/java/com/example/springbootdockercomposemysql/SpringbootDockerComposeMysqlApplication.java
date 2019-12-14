package com.example.springbootdockercomposemysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootDockerComposeMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerComposeMysqlApplication.class, args);
	}
}
