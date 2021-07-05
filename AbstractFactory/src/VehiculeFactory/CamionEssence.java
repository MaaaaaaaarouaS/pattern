package VehiculeFactory;

public class CamionEssence extends VehiculeHybride {

	public CamionEssence(String modele, String marque, int puissance) {
		super(modele, marque, puissance);
	}

	public String toString() {
		return "Camion Essence";
	}
}