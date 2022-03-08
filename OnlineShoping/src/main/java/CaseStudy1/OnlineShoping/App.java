package CaseStudy1.OnlineShoping;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	    public static void main( String[] args )
	    {
	    	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beanConfig.xml"});
	    	
	    	User user = context.getBean("user",User.class);
	    	System.out.println("User-Name       : " +user.getUsername());
	    	System.out.println("Email Id        : "+user.getEmail());
	    	System.out.println("Password        : "+user.getPassword());
	    	System.out.println("Shipping Address: "+user.getShipping_address());
	    	System.out.println("Billing Address : "+user.getBilling_address());
	    	System.out.println("=================================================================================");
	    	
	    	Product product = context.getBean("product",Product.class);
	    	System.out.println("Product Name     : "+product.getProduct_name());
	    	System.out.println("Price            : "+product.getPrice());
	    	System.out.println("Quantity In Stock: "+product.getQuantity_in_stock());
	    	System.out.println("Image Location   : "+product.getImagelocation());
	    	System.out.println("=================================================================================");
	    	
	    	Cart cart=(Cart)context.getBean("cart");
	    	List<Product> productList = cart.getProductList();
	    	 for(Product p:productList) {
	    		 System.out.println(p.getProduct_name());
	    		 System.out.println(p.getPrice());
	    		 System.out.println(p.getQuantity_in_stock());
	    		 System.out.println(p.getImagelocation());
	 	    	System.out.println("=================================================================================");
	     		
	    	 }
	    	System.out.println(cart.getTotal_amount());
	    	System.out.println(cart.isStatus());
	    	 System.out.println(cart.isConfirmOrder());
		    	System.out.println("=================================================================================");
	    
		    	Order order=(Order)context.getBean("order");
		    	 List<Cart> cartList=order.getCartList();
		    	 for(Cart c:cartList)
		    	 {
		    		 List<Product> pList=c.getProductList();
		    		 for(Product p:pList)
		    		 {
		    			 System.out.println("Product Name : "+p.getProduct_name());
		    			 System.out.println("Price : "+p.getPrice());
		    			 System.out.println("Quanity In Stock : "+p.getQuantity_in_stock());
		    			 System.out.println("Image Location : "+p.getImagelocation());
		 		    	System.out.println("=================================================================================");
		    		 }
		    		 System.out.println("Total Ammount : "+c.getTotal_amount());
		    		 System.out.println("Order Confirmation : "+c.isConfirmOrder());
		    		 System.out.println("Order Status"+c.isStatus());
				    	System.out.println();
		    	 }
			    	System.out.println("=================================================================================");
	    }
	}