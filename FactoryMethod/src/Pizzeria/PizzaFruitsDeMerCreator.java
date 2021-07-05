package Pizzeria;

public class PizzaFruitsDeMerCreator extends PizzaCreator{

	@Override
	public Pizza creerPizza() {
		return new PizzaFruitsDeMer();
	}

	
}
