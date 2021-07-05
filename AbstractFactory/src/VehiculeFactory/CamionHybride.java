package VehiculeFactory;

public class CamionHybride extends VehiculeHybride {

	public CamionHybride(String modele, String marque, int puissance) {
		super(modele, marque, puissance);
	}

	public String toString() {
		return "Camion Hybride";
	}
}
