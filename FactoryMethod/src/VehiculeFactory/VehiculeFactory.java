package VehiculeFactory;

public abstract class VehiculeFactory {

	public Vehicule CreerVehicule(String modele, String marque, int puissance) {
		return FabricateVehicule( modele, marque, puissance);
		
	}

	protected abstract Vehicule FabricateVehicule(String modele, String marque, int puissance);
}
