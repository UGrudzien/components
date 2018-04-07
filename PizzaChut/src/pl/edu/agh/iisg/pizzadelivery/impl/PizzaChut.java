package pl.edu.agh.iisg.pizzadelivery.impl;

import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.iisg.pizzadelivery.IPizzaDelivery;
import pl.edu.agh.iisg.pizzadelivery.Pizza;

public class PizzaChut implements IPizzaDelivery {
	Collection pizza;
	public PizzaChut() {
		pizza = new ArrayList();
		Pizza p1= new Pizza("Pieczarkowa",1);
		Pizza p2 = new Pizza ("Pepperoni", 1);
		Pizza p3 = new Pizza ("Hawajska",1);
		pizza.add(p1);
		pizza.add(p2);
		pizza.add(p3);
	}
	@Override
	public Collection<Pizza> getAllPizzas() {
		// TODO Auto-generated method stub
		return null;
	}

}
