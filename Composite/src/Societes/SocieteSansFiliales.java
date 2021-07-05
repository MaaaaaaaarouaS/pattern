package Societes;

public class SocieteSansFiliales extends Societe {

	public SocieteSansFiliales(double cout) {
		super(cout);
	}

	@Override
	public double calculCout() {
		return numVehicules*coutUnitaire;
	}

	@Override
	public void addSociete(Societe s) {
		throw new UnsupportedOperationException("addSociete impossible");
	}

	@Override
	public void deleteSociete(Societe s) {
		throw new UnsupportedOperationException("deleteSociete impossible");
	}

}
