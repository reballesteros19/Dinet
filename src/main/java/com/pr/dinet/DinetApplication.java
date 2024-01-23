package com.pr.dinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DinetApplication {

	public static void main(String[] args) {
		SpringApplication.run(DinetApplication.class, args);
	}

}
