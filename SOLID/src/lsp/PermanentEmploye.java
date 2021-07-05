package lsp;

public class PermanentEmploye extends Employee implements ISalary,ICommission{

	public PermanentEmploye(int id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return super.getSalary()*1.1;
	}

	@Override
	public double calculCommission() {
		// TODO Auto-generated method stub
		return super.getSalary()*0.05;
	}

}
