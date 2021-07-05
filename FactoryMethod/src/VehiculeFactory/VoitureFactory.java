package VehiculeFactory;

public class VoitureFactory extends VehiculeFactory {

	@Override
	protected Vehicule FabricateVehicule(String modele, String marque, int puissance) {
		return new Voiture(modele, marque, puissance);
	}

}
