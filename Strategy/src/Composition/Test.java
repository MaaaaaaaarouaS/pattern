package Composition;

public class Test {

	public static void main(String[] args) {
		Employe exemple = new Employe(new SalaireDeBaseCalculator(), 5000);
		System.out.println("Salaire de base:	" + exemple.getSalaire());
		exemple.setSalaireCalculator(new IngenieurITSalaireCalculator());
		System.out.println("Salaire d'ingenieur:	" + exemple.getSalaire());
		exemple.setSalaireCalculator(new ManagerITSalaireCalculator());
		System.out.println("Salaire de manager:	" + exemple.getSalaire());

	}

}
