

/**
 *We are creating a program for the Retail Store Management System,
 *and performing different different function which was asked to perform
 */
package storeManagement;//here i created package as storeMnagement
//package defined as group of similar types of classes,interface and enumeration
import java.util.ArrayList;//import keyword is used to import built-in and user defined packages into our java source file so that our class can refer to class thath is in another package by directly using its name
//java.util is a built-in package
/*ArrayList is one of the package in java.util
 * ArrayList provides resizable array,implements all list operations,allows all elements includes null
 * Arraylist implements methods from following classes
 * AbstractList:
 * AbstractCollection:
 * Object:object as state and behaviour,instance of class
 * List:
 */

/**
 * 
 *  here we are creating a customer class
 * classes are the basics of oops(object orineted  programming language)which revolve arround real life things,these are user defined blueprints that discribe the behaviour/state from which objects are created
 */
public class Customer {//public is a access modifier provides accessibility of data member,method,constructor or class
	                  //it can access within class,package,outside package by subclass only,outside package
	// here we are declaring some customer class properties
	public int customerId;//taken public int beacause it is a variable that has no access control,int is integer type in java
	String customerName;//string are sequence of characters,strings are objects,java provide string class to create or manipulate strings
	int customerNo;
	// here we are creating the arrayList for the product which is booked
	ArrayList<Product> bookedProductList = new ArrayList<Product>();//by using new keyword created object ArrayList
	private String contactNo;//private access only within class

	// here we are creating a method addBookedProduct
	// this method will give us a idea about the product which is booked by the customer
	public void addBookedProduct(Product obj) {//void is a keyword wont return any value after it is executed
		/*
		 * here customer will know which booked product is unavailable in his
		 * productList and also add product in his productList
		 */
		/*set is a collection that cannot contain duplicate elements*/
		obj.setProductStatus("unavailable");
		bookedProductList.add(obj);//adding objects of booked product list

	}

	/**
	 * here we are creating constructor for the customer class
	 * constructor is used to initialize the object,provides data for the object
	 * customerId
	 *  customerName
	 * 
	 *  contactNo
	 */
	public Customer(int customerId, String customerName, String contactNo) {
		super();//super keyword can be used to refer immediate parent class object, method,instance variables,constructor
		this.customerId = customerId;//taken this keyword to reffer these 3 objects
		this.customerName = customerName;
		this.contactNo = contactNo;
	}

	/**
	 * here we are using getter n setter with all three properties of customer
	 * class we are using the getter n setter because it help us to view the
	 * value of the variables,and we can also modify the value with the help of
	 * this getter n setter
	 * 
	 * @return
	 */

	public int getCustomerId() {//initializing customerId
		                      //here get method obtains customerId
		return customerId;//customerId will return using return keyword

	}

	public void setCustomerId(int customerId) {//set method stores the customerId details
		                                      //using void because it does not return customerId after it gets executed
		this.customerId = customerId;//refering customerID
	}

	public String getCustomerName() {//by using string class we can create  customer name
		return customerName;//returns
	}

	public void setCustomerName(String customerName) {//stores customerName 
		this.customerName = customerName;//refering customerName
	}

	public int getCustomerNo() {//initializng CustomerNo
		return customerNo;//returns
	}

	public void setCustomerNo(int CustomerNo) {//stores CustomerNo
		this.customerNo = CustomerNo;//refers
	}

}
