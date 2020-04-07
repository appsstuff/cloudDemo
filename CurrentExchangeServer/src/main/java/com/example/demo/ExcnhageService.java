package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ExcnhageService {
	
	@Autowired
	private ExchangeRepository repo;
		
	@Autowired
	private Environment env;

	public Exchange exchanegCurrecnyService(String from, String to) {
		Exchange ex = repo.findByFromAndTo(from, to);
		if(ex==null) {
			System.out.println("Current not found");
			return null;
		}
		
		return ex;
	}

}
