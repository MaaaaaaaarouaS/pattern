package Societes;

import java.util.ArrayList;
import java.util.List;

public class SocieteAvecFiliales extends Societe{
	List<Societe> SocietesFilles = new ArrayList<Societe>();
	
	public SocieteAvecFiliales(double cout) {
		super(cout);
	}


	public void addSociete(Societe s) {
		SocietesFilles.add(s);
	}
	public void deleteSociete(Societe s) {
		SocietesFilles.remove(s);
	}
	
	@Override
	public double calculCout() {
		double coutTotal = 0;
		for (Societe s : SocietesFilles) {
			coutTotal += s.calculCout();
		}
		return coutTotal + numVehicules* coutUnitaire;
	}

}
