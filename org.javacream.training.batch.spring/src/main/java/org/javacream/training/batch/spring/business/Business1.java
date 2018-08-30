package org.javacream.training.batch.spring.business;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //singleton ist default!
public class Business1 {

	@Autowired DataAccessSimulator simulator;
	@PostConstruct public void init() {
		System.out.println("PostConstruct " + this + ", simulator=" + simulator);
	}
	
	{
		System.out.println("Initializing " + this + ", simulator=" + simulator);
	}
	
	
	public void doSomething() {
		System.out.println("doing something using " + this);
		System.out.println("simulator = " + simulator);
		simulator.saveToDatabase();
		
	}
}