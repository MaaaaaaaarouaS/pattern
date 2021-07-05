package Pizzeria;

public class PizzaAuThonCreator extends PizzaCreator{

	@Override
	public Pizza creerPizza() {
		return new PizzaAuThon();
	}

}
