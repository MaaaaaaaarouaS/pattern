package VehiculeFactory;

public class CamionFactory extends VehiculeFactory {

	@Override
	protected Vehicule FabricateVehicule(String modele, String marque, int puissance) {
		return new Camion(modele, marque, puissance);
	}

}
