package CaseStudy1.OnlineShoping;

import java.util.List;

public class Cart {
	
	private User User;
	List<Product> productList;
	private float total_amount;
	private boolean Status;
	private boolean ConfirmOrder;
	
	public Cart() {}

	public Cart(User user, List<Product> productList, float total_amount, boolean status, boolean confirmOrder) {
		super();
		this.User = user;
		this.productList = productList;
		this.total_amount = total_amount;
		Status = status;
		ConfirmOrder = confirmOrder;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		this.User = user;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public boolean isConfirmOrder() {
		return ConfirmOrder;
	}

	public void setConfirmOrder(boolean confirmOrder) {
		ConfirmOrder = confirmOrder;
	}
	
}				