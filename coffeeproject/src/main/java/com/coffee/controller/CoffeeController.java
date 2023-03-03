package com.coffee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.entity.Coffee;






@RestController
public class CoffeeController {
	

	private List<Coffee> coffee = new ArrayList<>();
	
	public CoffeeController() {
		coffee.addAll(List.of(new Coffee("Arabica", 280.00), new Coffee("Robusta", 350.20), new Coffee("Excelsa", 450.00),
				new Coffee("Liberica", 380.8)

		));
		
		
	}
	@RequestMapping(value = "/coffee", method = RequestMethod.GET)
	
	Iterable<Coffee> getAllLeds() {
		return coffee;

	}

}

