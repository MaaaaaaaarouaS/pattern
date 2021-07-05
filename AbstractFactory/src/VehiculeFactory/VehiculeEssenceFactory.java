package VehiculeFactory;

public class VehiculeEssenceFactory extends VehiculeFactory {

	@Override
	protected Vehicule FabricateVoiture(String modele, String marque, int puissance) {
		return new VoitureEssence(modele, marque, puissance);
	}

	@Override
	protected Vehicule FabricateCamion(String modele, String marque, int puissance) {
		return new CamionEssence(modele, marque, puissance);
	}

	@Override
	protected Vehicule FabricateAutoCar(String modele, String marque, int puissance) {
		return new AutoCarEssence(modele, marque, puissance);
	}

}
