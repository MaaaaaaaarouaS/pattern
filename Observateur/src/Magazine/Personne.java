package Magazine;

public abstract class Personne {
	
	public void informer(String nomAttribut, Object nouvelleValeur, Revue r) {
		System.out.println("Une modification a �t� apport�e � la revue: " + nomAttribut + " = " + nouvelleValeur);
		//System.out.println(r);
	}
}
