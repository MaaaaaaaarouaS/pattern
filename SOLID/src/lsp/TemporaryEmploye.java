package lsp;

public class TemporaryEmploye extends Employee implements ISalary, ICommission{

	public TemporaryEmploye(int id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return super.getSalary()*1.05;
	}

	@Override
	public double calculCommission() {
		// TODO Auto-generated method stub
		return super.getSalary()*0.01;
	}

}
