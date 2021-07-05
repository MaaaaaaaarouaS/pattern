package VehiculeFactory;

public  abstract class VehiculeFactory {

	public Vehicule CreerVoiture(String modele, String marque, int puissance) {
		return FabricateVoiture( modele, marque, puissance);
	}
	public Vehicule CreerCamion(String modele, String marque, int puissance) {
		return FabricateCamion( modele, marque, puissance);
	}
	public Vehicule CreerAutoCar(String modele, String marque, int puissance) {
		return FabricateAutoCar( modele, marque, puissance);
	}

	protected abstract Vehicule FabricateVoiture(String modele, String marque, int puissance);
	protected abstract Vehicule FabricateCamion(String modele, String marque, int puissance);
	protected abstract Vehicule FabricateAutoCar(String modele, String marque, int puissance);
}
