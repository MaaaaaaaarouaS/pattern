package Composition;

public class Employe {

	private SalaireCalculator salaireCalculator;
	private double salaireDeBase;
	
	public Employe(SalaireCalculator s, double sDeBase) {
		salaireCalculator = s;
		salaireDeBase = sDeBase;
	}
	
	public void setSalaireCalculator(SalaireCalculator s) {
		this.salaireCalculator = s;
	}
	
	public double getSalaire() {
		return salaireCalculator.salaireCalculator(salaireDeBase);
	}
	
}
