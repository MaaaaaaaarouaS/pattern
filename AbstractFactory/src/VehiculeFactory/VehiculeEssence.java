package VehiculeFactory;

public class VehiculeEssence extends Vehicule{

	public VehiculeEssence(String modele, String marque, int puissance) {
		super(modele, marque, puissance);
	}

	public String toString() {
		return "Essence";
	}
}
