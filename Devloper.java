public class Devloper extends Employee{
	private int noofhours;

	public Devloper(int empId, String empName, double empSal, int noofhours) {
		super(empId, empName, empSal);
		this.noofhours = noofhours;
	}

	public int getNoofhours() {
		return noofhours;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :- "+getEmpId()+"\nName :- "+getEmpName()+"\nSalary :- "+getEmpSal()+"\nNo. of Hours :- "+getNoofhours();
	}
}