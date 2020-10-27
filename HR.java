
public class HR extends Employee{
	private int no_of_hires;

	public HR(int empId, String empName, double empSal, int no_of_hires) {
		super(empId, empName, empSal);
		this.no_of_hires = no_of_hires;
	}

	public int getNo_of_hires() {
		return no_of_hires;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :- "+getEmpId()+"\nName :- "+getEmpName()+"\nSalary :- "+getEmpSal()+"\nNo. of Hires :- "+getNo_of_hires();
	}
}