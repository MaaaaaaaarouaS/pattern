package VehiculeFactory;

public class AutoCarHybride extends VehiculeHybride{

	public AutoCarHybride(String modele, String marque, int puissance) {
		super(modele, marque, puissance);
	}

	public String toString() { 
		return "AutoCar Hybride";
	}
}
