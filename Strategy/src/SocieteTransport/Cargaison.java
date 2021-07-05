package SocieteTransport;

import java.util.Arrays;
import java.util.List;

public class Cargaison {
	
	private double distance;
	private ICoutCalcul calculator;
	private List<Marchandise> listeMarchandises = Arrays.asList(new Marchandise(1,800,500), new Marchandise(2, 1000, 400), new Marchandise(3, 1200, 700));
	
	public Cargaison(double distance, ICoutCalcul calculator) {
		super();
		this.distance = distance;
		this.calculator = calculator;
	}
	public double calculerCout() {
		
		return calculator.calculerCout(this);
	}
	public double getTotalPoids() {
		double total=0;
		for(Marchandise m : listeMarchandises) {
			total += m.getPoids();
		}
		return total;
	}
	
	public double getTotalVolume() {
		double total=0;
		for(Marchandise m : listeMarchandises) {
			total += m.getVolume();
		}
		return total;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public void setCalculator(ICoutCalcul calculator) {
		this.calculator = calculator;
	}
	
	
	
}
