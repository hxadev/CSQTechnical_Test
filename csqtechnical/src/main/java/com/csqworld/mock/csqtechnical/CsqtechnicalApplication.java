package com.csqworld.mock.csqtechnical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CsqtechnicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsqtechnicalApplication.class, args);
	}

}
