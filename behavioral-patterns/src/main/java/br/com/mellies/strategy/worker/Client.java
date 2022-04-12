package br.com.mellies.strategy.worker;

import br.com.mellies.strategy.worker.jobs.Developer;
import br.com.mellies.strategy.worker.jobs.HispsterDeveloper;
import br.com.mellies.strategy.worker.jobs.Pilot;
import br.com.mellies.strategy.worker.jobs.Worker;

public class Client {

	public static void presentYourself(Worker worker, String name) {
		System.out.println("Hi, I'm " + name);
		worker.eat();
		worker.move();
		worker.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Worker jhon = new Developer();
		presentYourself(jhon, "Jhon");
		
		Worker ann = new Pilot();
		presentYourself(ann, "Ann");

		Worker carol = new HispsterDeveloper();
		presentYourself(carol, "carol");
		
		
	}
}
