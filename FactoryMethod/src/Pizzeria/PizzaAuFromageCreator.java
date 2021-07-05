package Pizzeria;

public class PizzaAuFromageCreator extends PizzaCreator{

	@Override
	public Pizza creerPizza() {
		return new PizzaAuFromage();
	}

}
