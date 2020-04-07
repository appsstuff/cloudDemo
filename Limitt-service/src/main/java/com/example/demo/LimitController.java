package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LimitController {

	@Autowired
	private ConfigProperty con;
	
	
	@RequestMapping("/limit")
	public LimitConfig getLimitConfig() {
		return new LimitConfig(con.getMax(),con.getMin());
	}
}