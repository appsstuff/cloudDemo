package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class CurrentConvertServerApplication {

	@Autowired
	private ExcnhageService excnhageService;
	
	public static void main(String[] args) {
		SpringApplication.run(CurrentConvertServerApplication.class, args);
	}
	
	@RequestMapping("/exchange-currency/{from}/to/{to}/{ammount}")
	public ExchangeDomain exchangeCurrency(
			@PathVariable ("from") String from,
			@PathVariable ("to") String to,
			@PathVariable ("ammount") int ammount) {
		return excnhageService.exchanegCurrecnyService(from, to, ammount);
	}

}
