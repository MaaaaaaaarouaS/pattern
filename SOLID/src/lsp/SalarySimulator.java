package lsp;

import java.util.Arrays;
import java.util.List;

public class SalarySimulator {

	public static void main(String[] args) {
	
		List<ICommission> employes = Arrays.asList(new PermanentEmploye(10, "Hamza", 8000),
				new TemporaryEmploye(20, "Samira", 10000));
		System.out.println("***********calcul de la commission *************");
		
		employes.forEach(emp->System.out.println(emp.calculCommission()));
		
		System.out.println("***********calcul du salaire *************");
		List<ISalary> employes2 = Arrays.asList(
				new PermanentEmploye(10, "Hamza", 8000),
				new TemporaryEmploye(20, "Samira", 10000),
				new ContractualEmploye(30, "Hamid", 1500, 15));
		
		employes2.forEach(emp->System.out.println(emp.calculSalaire()));
	}

}
