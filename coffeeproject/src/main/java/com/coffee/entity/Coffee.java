package com.coffee.entity;

import java.util.UUID;

public class Coffee {
	
	private final String id;
	private String coffeeName;
	private Double coffeePrice;
	
	public Coffee(final String id, final String coffeeName, final Double coffeePrice) {
		
		this.id = id;
		this.coffeeName = coffeeName;
		this.coffeePrice = coffeePrice;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(final String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public Double getCoffeePrice() {
		return coffeePrice;
	}

	public void setCoffeePrice(final Double coffeePrice) {
		this.coffeePrice = coffeePrice;
	}
	
	public String getId() {
		return id;
	}

	
	public Coffee(final String coffeeName, final Double coffeePrice) {
		this(UUID.randomUUID().toString(),coffeeName , coffeePrice);
	}

	@Override
	public String toString() {
		return "Coffee [id=" + id + ", coffeeName=" + coffeeName + ", coffeePrice=" + coffeePrice + "]";
	}
	
	
	
	

}
