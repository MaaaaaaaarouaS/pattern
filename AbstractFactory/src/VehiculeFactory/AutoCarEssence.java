package VehiculeFactory;

public class AutoCarEssence extends VehiculeEssence{

	public AutoCarEssence(String modele, String marque, int puissance) {
		super(modele, marque, puissance);
	}

	public String toString() { 
		return "AutoCar Essence";
	}
}
