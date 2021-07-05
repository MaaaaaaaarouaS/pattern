package SocieteTransport;

public class CalculCoutMaritime implements ICoutCalcul {

	@Override
	public double calculerCout(Cargaison c) {
		if(c.getTotalVolume()<45000)
			return c.getTotalPoids()*8*c.getDistance();
		else
			return  c.getTotalPoids()*9*c.getDistance();
	}

}
