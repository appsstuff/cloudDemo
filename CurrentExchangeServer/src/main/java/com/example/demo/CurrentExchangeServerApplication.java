package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class CurrentExchangeServerApplication {

	@Autowired
	private ExcnhageService excnhageService;
	
	public static void main(String[] args) {
		SpringApplication.run(CurrentExchangeServerApplication.class, args);
	}
	
	@RequestMapping("/exchange-currency/{from}/to/{to}/{ammount}")
	public ExchangeDomain exchangeCurrency(
			@PathVariable ("from") String from,
			@PathVariable ("to") String to,
			@PathVariable ("ammount") int ammount) {
		return excnhageService.exchanegCurrecnyService(from, to, ammount);
	}

}
