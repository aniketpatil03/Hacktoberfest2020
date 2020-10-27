
public class Product {
	private int prodId;
	private String prodName;
	private double price;
	private int qty;

	public Product(int prodId, String prodName, double price, int qty) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.qty = qty;
	}

	public int getProdId() {
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}
}