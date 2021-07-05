package Pizzeria;
import java.lang.reflect.InvocationTargetException;

public class TestPizzeria {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		//Pizzeria pizzeria = new Pizzeria();		
		//Pizza pizza = pizzeria.commander("PizzaAuFromage");
		//Pizza pizza = pizzeria.commander("PizzaAuFromage", "XL", 40);
		//System.out.println(pizza);
		
		Pizzeria pizzeria;
		
		pizzeria = new Pizzeria(new PizzaAuThonCreator());
		System.out.println(pizzeria.commander());
		System.out.println("**************************");

		pizzeria = new Pizzeria(new PizzaAuFromageCreator());
		System.out.println(pizzeria.commander());
		System.out.println("**************************");

		pizzeria = new Pizzeria(new PizzaFruitsDeMerCreator());
		System.out.println(pizzeria.commander());
		
	}

}
