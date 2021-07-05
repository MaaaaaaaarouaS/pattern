package Societes;

public abstract class Societe {
	protected int numVehicules = 0;
	protected double coutUnitaire;
	
	public Societe(double cout) {
		this.coutUnitaire = cout;	
	}



	public abstract void addSociete(Societe s) ;
	public abstract void deleteSociete(Societe s) ;
	
	
	public void addVehicules(int n) {
		numVehicules += n;
	}
	public void deleteVehicules(int n) {
		numVehicules -= n;
	}

	public abstract double calculCout();
}
