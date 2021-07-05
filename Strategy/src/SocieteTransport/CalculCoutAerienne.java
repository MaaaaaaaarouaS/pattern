package SocieteTransport;



public class CalculCoutAerienne implements ICoutCalcul {

	@Override
	public double calculerCout(Cargaison c) {
		if(c.getTotalVolume()<80000)
			return c.getTotalPoids()*10*c.getDistance();
		else
			return  c.getTotalPoids()*12*c.getDistance();
	}

}
