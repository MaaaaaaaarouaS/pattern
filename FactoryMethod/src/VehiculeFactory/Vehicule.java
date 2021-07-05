package VehiculeFactory;

public abstract class Vehicule {

	private int puissance;
	private String modele;
	private String marque;
	
	public Vehicule (String modele, String marque, int puissance) {
		this.modele = modele;
		this.marque = marque;
		this.puissance = puissance;
	}
}
