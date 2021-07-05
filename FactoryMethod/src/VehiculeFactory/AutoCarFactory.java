package VehiculeFactory;

public class AutoCarFactory extends VehiculeFactory {

	

	@Override
	protected Vehicule FabricateVehicule(String modele, String marque, int puissance) {
		return new AutoCar(modele, marque, puissance);
	}

}
