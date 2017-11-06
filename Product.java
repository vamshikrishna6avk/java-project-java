package storeManagement;//in a single package that is storeMnagement i created all four classes

/*
 * here we are creating product class
 */
public class Product {
	// here we are declaring some product class properties
	public int productId;//initializng productId using integer
	String productName;//using string taking productName
	double productPrice;//double is used for number having decimal so taking productPrice
	String productStatus = "Available";//string is used beacause it is a collection of characters

	/**
	 * here we are creating constructor for the product class
	 * constructor is used to initialize the object,provides data for the object
	 *  productId
	 *  productName
	 * productPrice
	 */
	public Product(int productId, String productName, double productPrice) {
		super();//super keyword can be used to refer immediate parent class object, method,instance variables,constructor
		this.productId = productId;//taken this keyword to reffer these 3 objects
		this.productName = productName;
		this.productPrice = productPrice;
	}

	/**
	 * here we are using getter n setter with all three properties of product
	 * class we are using the getter n setter because it help us to view the
	 * value of the variables,and we can also modify the value with the help of
	 * this getter n setter
	 * 
	 * @return
	 */

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

	public double getProductPrice() {
		return productPrice;

	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductStatus() {
		return productStatus;

	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}
