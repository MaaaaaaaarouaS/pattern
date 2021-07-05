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
		setVehiculeFactory(vf);
	}
	
	public void setVehiculeFactory(VehiculeFactory vf) {
		this.vf = vf;
	}
	/*
	public void CreerVehicule(int ) {
		
		if (numVehicule == 1) {
			vf = new VoitureFactory();
		}
		else if(numVehicule == 2) {
			vf = new CamionFactory();
		}
		else {
			vf = new AutoCarFactory();
		}
		
		Vehicule v = vf.CreerVehicule("", "", 10000);
		System.out.println(v);
		Vehicules.add(v);
	}
	*/

	public void CreerVehicule() {
		
		Vehicule v = vf.CreerVehicule("", "", 10000);
		//System.out.println(v);
		Vehicules.add(v);
	}
	
	public List<Vehicule> AfficherListevehicules(){
		/*
		for( Vehicule v : Vehicules) {
			System.out.println( v);
		}
		*/
		return Vehicules;
	}
	
	
}
