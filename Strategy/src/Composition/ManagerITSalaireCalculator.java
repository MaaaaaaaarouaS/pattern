package Composition;

public class ManagerITSalaireCalculator implements SalaireCalculator{
	
	
	@Override
	public double salaireCalculator(double salaire) {
		return salaire*(1 + 0.1);
	}

}
