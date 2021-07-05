package VehiculeFactory;

public class VehiculeHybride extends Vehicule{

	public VehiculeHybride(String modele, String marque, int puissance) {
		super(modele, marque, puissance);
	}
	
	public String toString() {
		return "Hybride";
	}

}
