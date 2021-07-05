package VehiculeFactory;

public class VoitureEssence extends VehiculeEssence{

	public VoitureEssence(String modele, String marque, int puissance) {
		super(modele, marque, puissance);
	}

	public String toString() {
		return "Voiture Essence";
	}
}
