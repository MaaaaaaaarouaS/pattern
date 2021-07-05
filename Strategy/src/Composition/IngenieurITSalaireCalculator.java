package Composition;

public class IngenieurITSalaireCalculator implements SalaireCalculator{

	
	public double salaireCalculator(double salaire) {

		return salaire*(1 + 0.05);
	}

}
