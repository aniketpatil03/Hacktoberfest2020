
public class Tester extends Employee {
	private int no_of_test_cases;

	public Tester(int empId, String empName, double empSal, int no_of_test_cases) {
		super(empId, empName, empSal);
		this.no_of_test_cases = no_of_test_cases;
	}

	public int getNo_of_test_cases() {
		return no_of_test_cases;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID :- "+getEmpId()+"\nName :- "+getEmpName()+"\nSalary :- "+getEmpSal()+"\nNo. of Test Cases :- "+getNo_of_test_cases();
	}
}