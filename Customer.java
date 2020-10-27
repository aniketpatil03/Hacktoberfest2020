
public class Customer {
	private int custId, pno;
	private String custName;
	private Product parr[];
	private Bill bill;
	
	public Customer(int custId, String custName,Product parr[], int pno, Bill bill) {
		this.custId = custId;
		this.custName = custName;
		this.parr=parr;
		this.pno=pno;
		this.bill=bill;
	}
	
	public Customer(int custId, String custName,Product parr[], int pno) {
		this.custId = custId;
		this.custName = custName;
		this.parr=parr;
		this.pno=pno;
	}
	
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public Product[] getProduct() {
		return parr;
	}
	public int getPno() {
		return pno;
	}
	public Bill getBill() {
		return bill;
	}	
}