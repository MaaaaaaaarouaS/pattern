package lsp;

public class ContractualEmploye extends Employee implements ISalary {
    
	private int nbJours;
	
	public ContractualEmploye(int id, String name, double salary, int days) {
		super(id, name, salary);
		this.nbJours = days;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return super.getSalary()*nbJours;
	}

	

}
