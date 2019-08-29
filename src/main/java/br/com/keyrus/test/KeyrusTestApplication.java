package br.com.keyrus.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.keyrus.test.*"})
public class KeyrusTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyrusTestApplication.class, args);
	}

}
