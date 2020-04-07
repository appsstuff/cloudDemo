package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="currencyexchange",url = "localhost:8000")
public interface ExchangeServerInterface {

	@RequestMapping("/exchange-currency/{from}/to/{to}")
	public Exchange exchangeCurrency(@PathVariable ("from") String from,@PathVariable ("to") String to);
}
