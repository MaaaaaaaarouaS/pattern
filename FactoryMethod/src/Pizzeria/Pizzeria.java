package Pizzeria;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Pizzeria {

	/*
	public Pizza commander(String type) {
		Pizza p;
		if (type == "PizzaAuFromage") {
			p = new PizzaAuFromage();
		}
		else if (type == "PizzaAuThon") {
			p = new PizzaAuThon();
		}
		else{
			p = new PizzaFruitsDeMer();
		}		
		return p;
		//Pas d'OCP !!!!!
	}
	*/
	
	/*
	public Pizza commander(String type, String taille, double prix) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Pizza p;
		
		Class<?> c = Class.forName(type);
		Constructor<?> cons = c.getConstructor(String.class, double.class);
		p = (Pizza) cons.newInstance(taille, prix);
		return p;
	}
	*/
	/*
	public Pizza commander(String type) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Pizza p;
		
		Class<?> c = Class.forName(type);
		p = (Pizza) c.newInstance();
		return p;
	}
	*/
	
	private PizzaCreator createurPizza;
	
	public Pizzeria(PizzaCreator p) {
		setPizzaCreator(p);
	}
	
	public Pizza commander() {
		return createurPizza.creerPizza();
	}

	public void setPizzaCreator(PizzaCreator p) {
		createurPizza = p;
	}
	public PizzaCreator getPizzaCreator() {
		return createurPizza;
	}
	
}
