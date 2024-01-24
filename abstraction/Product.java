package abstraction;

public class Product {
	private int productId;
	private String productName;
	private double price;
	

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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static void main(String[] args) {
		Product product=new Product();
		product.setProductId(111);
		product.setProductName("Television");
		product.setPrice(45000);
		System.out.println("Product Id: "+product.getProductId());
		System.out.println("Product Name: "+product.getProductName());
		System.out.println("Product Price: "+product.getPrice());
		// TODO Auto-generated method stub

	}

}
