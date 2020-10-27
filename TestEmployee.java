import java.util.Scanner;

public class TestEmployee {

	public static void display(Employee e) {
		System.out.println("-----------------------");
		//System.out.println(e);
		System.out.println("ID :- "+e.getEmpId());
		System.out.println("Name :- "+e.getEmpName());
		System.out.println("Salary :- "+e.getEmpSal());
		if(e instanceof Manager) {
			Manager m = (Manager) e;
			System.out.println("Bonus :- "+m.getBonus());
		}
		else if(e instanceof Devloper) {
			Devloper d = (Devloper) e;
			System.out.println("No. of Hours :- "+d.getNoofhours());
		}
		else if(e instanceof HR) {
			HR h = (HR) e;
			System.out.println("No. of Hires :- "+h.getNo_of_hires());
		}
		else if(e instanceof Tester) {
			Tester t = (Tester) e;
			System.out.println("No. of Test Cases :- "+t.getNo_of_test_cases());
		}
		System.out.println("-----------------------");
	}
	
	public static void main(String[] args) {
		int ch, id, noho, nohi, notc;
		double sal, bonus;
		String ans, name;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Add \n1) Manager\n2) Devloper\n3) HR\n4) Tester");
			ch = sc.nextInt();
			switch(ch) {
				case 1 : System.out.print("Manager Details :- \nID :- ");
						 id = sc.nextInt();
		 		 		 System.out.print("Name :- ");
		 		 		 name = sc.next();
		 		 		 System.out.print("Salary :- ");
		 		 		 sal = sc.nextDouble();
		 		 		 System.out.print("Bonus :- ");
		 		 		 bonus = sc.nextDouble();
		 		 		 
		 		 		 Manager m = new Manager(id, name, sal, bonus);
		 		 		 display(m);
						 break;
						 
				case 2 : System.out.print("Devloper Details :- \nID :- ");
						 id = sc.nextInt();
				 		 System.out.print("Name :- ");
				 		 name = sc.next();
				 		 System.out.print("Salary :- ");
				 		 sal = sc.nextDouble();
				         System.out.print("No. of Hours :- ");
				         noho = sc.nextInt();
				 		 
				 		 Devloper d = new Devloper(id, name, sal, noho);
				 		 display(d);
				 		 break;
			 	 		 
				case 3 : System.out.print("HR Details :- \nID :- ");
						 id = sc.nextInt();
		 		 		 System.out.print("Name :- ");
		 		 		 name = sc.next();
		 		 		 System.out.print("Salary :- ");
		 		 		 sal = sc.nextDouble();
		 		 		 System.out.print("No. of Hires :- ");
		 		 		 nohi = sc.nextInt();
		 		 		 
		 		 		 HR h = new HR(id, name, sal, nohi);
		 		 		 display(h);
		 		 		 break;
		 		 		 
				case 4 : System.out.print("Tester Details :- \nID :- ");
				 		 id = sc.nextInt();
				 		 System.out.print("Name :- ");
				 		 name = sc.next();
				 		 System.out.print("Salary :- ");
				 		 sal = sc.nextDouble();
				 		 System.out.print("No. of Test Cases :- ");
				 		 notc = sc.nextInt();
 		 		 
				 		 Tester t = new Tester(id, name, sal, notc);
				 		 display(t);
				 		 break;
 		 		 
			 	default : System.out.println("Invalid Input....");
			 	  		   break;
			}
			System.out.print("Do you want to continue? (Y/N) :- ");
			ans = sc.next();
		}while(ans.equalsIgnoreCase("Y"));
		sc.close();
	}
}