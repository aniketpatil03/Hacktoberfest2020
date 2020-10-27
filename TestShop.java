import java.util.Scanner;

public class TestShop {

	public static void main(String[] args) {
		
		final int max = 50;
		Customer c[] = new Customer[max];
		Scanner sc = new Scanner(System.in);
		String ans, cname, pname;
		int cid, pid, pprc, pqty;
		double total=0, finaltotal=0, gst=0;
		int i=0, j=0;
		
		do {
		
			System.out.println("Enter Customer Details :- ");
			
			System.out.print("ID : ");
			cid = sc.nextInt();
			
			System.out.print("Name : ");
			cname = sc.next();
			
			Product p[] = new Product[max];
			i=0;
			
			do {
				System.out.println("Enter Product Details :- ");
				
				System.out.print("ID : ");
				pid = sc.nextInt();
				
				System.out.print("Name : ");
				pname = sc.next();
				
				System.out.print("Price : ");
				pprc = sc.nextInt();
				
				System.out.print("Quantity : ");
				pqty = sc.nextInt();
				
				Product pa = new Product(pid, pname, pprc, pqty);
				p[i] = pa;
				i++;
				
				total = total + pprc*pqty;
				
				System.out.println("Do you want to add new Product? (Y/N)");
				ans = sc.next();
				
			}while(ans.equals("Y"));
			
			gst = total*0.12;
			finaltotal = total + gst;
			Bill b = new Bill(cid, total, finaltotal, gst);
			
			Customer ca = new Customer(cid, cname, p, i, b);
			c[j] = ca;
			j++;
			
			System.out.println("Do you want to add new Customer? (Y/N) :- ");
			ans = sc.next();
			
		}while(ans.equals("Y"));
		
		for(int m=0; m<j; m++){
			Customer customer = c[m];
			
			System.out.println("***************************************");
			System.out.println("Customer ID \t: \t"+customer.getCustId());
			System.out.println("Customer Name \t: \t"+customer.getCustName());
			System.out.println("***************************************");
						
			for(int n=0; n<customer.getPno(); n++) {
				
				Product parr[] = customer.getProduct();

				System.out.println("Product ID \t: \t"+parr[n].getProdId());
				System.out.println("Product Name \t: \t"+parr[n].getProdName());
				System.out.println("Product Price \t: \t"+parr[n].getPrice());
				System.out.println("Product Qty \t: \t"+parr[n].getQty());
				System.out.println("***************************************");
				
			}
			
			System.out.println("Bill :- ");
			System.out.println("Bill No. \t: \t"+customer.getBill().getBillno());
			System.out.println("Total Amount \t: \t"+customer.getBill().getTotal());
			System.out.println("GST Amount \t: \t"+customer.getBill().getGst());
			System.out.println("Final Amount \t: \t"+customer.getBill().getFinaltotal());
			System.out.println("***************************************");
		}		
		sc.close();
	}
}
