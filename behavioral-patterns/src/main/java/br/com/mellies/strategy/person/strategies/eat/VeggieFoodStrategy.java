package br.com.mellies.strategy.person.strategies.eat;

public class VeggieFoodStrategy implements EatStrategy {

	@Override
	public void eat() {
		System.out.println("I eat veggie food!");
	}
	
}
