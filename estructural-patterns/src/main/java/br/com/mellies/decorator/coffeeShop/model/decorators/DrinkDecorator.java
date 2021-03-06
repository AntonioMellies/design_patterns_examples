package br.com.mellies.decorator.coffeeShop.model.decorators;

import br.com.mellies.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}