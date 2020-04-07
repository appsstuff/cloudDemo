package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ExcnhageService {
	
	@Autowired
	private ExchangeServerInterface exchangeService; 
	
	@Autowired
	private Environment env;
	
	public ExchangeDomain exchanegCurrecnyService(String from, String to , int ammount) {
		
		Exchange ex = exchangeService.exchangeCurrency(from, to);
			
		if(ex==null) {
			System.out.println("Current not found");
			return null;
		}
		
		int port= Integer.parseInt(env.getProperty("server.port"));
		
		ExchangeDomain domain = new ExchangeDomain();
		domain.setInstance(env.getProperty("eureka.instance.instance-id"));
		domain.setPort(port);
		domain.setFrom(from);
		domain.setTo(to);
		domain.setRate(ex.getRate());
		domain.setAmmount(ammount);
		domain.setExchanged( ex.getRate().multiply(new BigDecimal(ammount)));
		
		return domain;
	}

}
