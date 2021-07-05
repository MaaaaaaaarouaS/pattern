package SocieteTransport;

public class CalculCoutRoutiere implements ICoutCalcul {

	/*
	 	cout=4 x distance x poids total si le volume total est inférieur à 380000
		cout=6 x distance x poids total si le volume total est supérieur ou égale à 380000

	 */
	
	
	@Override
	public double calculerCout(Cargaison c) {
		if(c.getTotalVolume()<380000)
			return c.getTotalPoids()*4*c.getDistance();
		else
			return  c.getTotalPoids()*6*c.getDistance();
	}

}
