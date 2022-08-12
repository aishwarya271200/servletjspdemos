package business;

public class Product {
	private int productId;
	private String productName;
	private String productqty;
	
	
	public Product(int parseInt, String parameter, String parameter2) {
		
		
	}

public void product(int productId, String productName, String productqty) {
	//super();
		this.productId = productId;
		this.productName = productName;
		this.productqty = productqty;
}
	

	public Product() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductqty() {
		return productqty;
	}

	public void setProductqty(String productqty) {
		this.productqty = productqty;
	}

	
	

	@Override
	public String toString() {
		
		return "Product: " + productName + "<br/>" + "Product ID: " + productId + "<br/>" + "Quantity: " + productqty + "<br/>" ;
	}
}
