package VehiculeFactory;
import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	private List<Vehicule> Vehicules = new ArrayList<Vehicule>();
	private VehiculeFactory vf;

	public Catalogue(VehiculeFactory vf) {
		setVehiculeFactory(vf);
	}
	public Catalogue() {
	}
	
	public void setVehiculeFactory(VehiculeFactory vf) {
		this.vf = vf;
	}

	public void CreerVehicule() {		
		Vehicule v = vf.CreerVoiture("", "", 10000);
		Vehicules.add(v);
		v = vf.CreerCamion("", "", 10000);
		Vehicules.add(v);
		v = vf.CreerAutoCar("", "", 10000);
		Vehicules.add(v);
	}
	
	public List<Vehicule> AfficherListevehicules(){
		return Vehicules;
	}	
}
