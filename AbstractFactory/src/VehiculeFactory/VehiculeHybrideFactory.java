package VehiculeFactory;

public class VehiculeHybrideFactory extends VehiculeFactory {

	@Override
	protected Vehicule FabricateVoiture(String modele, String marque, int puissance) {
		return new VoitureHybride(modele, marque, puissance);
	}

	@Override
	protected Vehicule FabricateCamion(String modele, String marque, int puissance) {
		return new CamionHybride(modele, marque, puissance);
	}

	@Override
	protected Vehicule FabricateAutoCar(String modele, String marque, int puissance) {
		return new AutoCarHybride(modele, marque, puissance);
	}

}
