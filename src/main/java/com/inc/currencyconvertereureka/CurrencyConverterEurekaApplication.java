package com.inc.currencyconvertereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CurrencyConverterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterEurekaApplication.class, args);
	}

}
