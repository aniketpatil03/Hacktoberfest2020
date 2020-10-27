public class Manager extends Employee {
	private double bonus;
	public Manager(int empId, String empName, double empSal, double bonus) {
		super(empId, empName, empSal);
		this.bonus = bonus;
	}
	public double getBonus() {
		return bonus;
	}

	@Override 
	public String toString() { 
		// TODO Auto-generated method stub
		return "ID :- "+getEmpId()+"\nName :- "+getEmpName()+"\nSalary :- "+getEmpSal() +"\nBonus :- "+getBonus(); 
	}	
}