package CaseStudy1.OnlineShoping;

public class Product {
	private String product_name;
	private double price;
	private int quantity_in_stock;
	private String imagelocation;
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity_in_stock() {
		return quantity_in_stock;
	}
	public void setQuantity_in_stock(int quantity_in_stock) {
		this.quantity_in_stock = quantity_in_stock;
	}
	public String getImagelocation() {
		return imagelocation;
	}
	public void setImagelocation(String imagelocation) {
		this.imagelocation = imagelocation;
	}
	public Product(String product_name, double price, int quantity_in_stock, String imagelocation) {
		super();
		this.product_name = product_name;
		this.price = price;
		this.quantity_in_stock = quantity_in_stock;
		this.imagelocation = imagelocation;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
