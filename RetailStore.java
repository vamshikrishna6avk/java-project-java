package storeManagement;//creating another class in same package storeManagement

import java.util.ArrayList;//import keyword is used to import built-in and user defined packages into our java source file so that our class can refer to class thath is in another package by directly using its name
//java.util is a built-in package
/*ArrayList is one of the package in java.util
* ArrayList provides resizable array,implements all list operations,allows all elements includes null

/**
 * here we are creating a class retailStore
 * 

 *
 */
public class RetailStore {
	// declaring properties of retailStore
	String storeName;//string is used beacause it is a collection of characters
	                 //taking storeName

	/**
	 * creating constructor for retailStore
	 * * constructor is used to initialize the object,provides data for the object
	 *storeName
	 */
	public RetailStore(String storeName) {
		super();//super keyword can be used to refer immediate parent class object, method,instance variables,constructor
		this.storeName = storeName;//taken this keyword to reffer storeName
	}

	/**
	 * here we are using getter n setter
	 *  here we are using getter n setter with all three properties of customer
	 * class we are using the getter n setter because it help us to view the
	 * value of the variables,and we can also modify the value with the help of
	 * this getter n setter
	 * @return
	 */
	public String getstoreName() {//by using string class we can create  storeName
		return storeName;//store name will return using return keyword

	}

	public void setstoreName(String storeName) {
		this.storeName = storeName;
	}

	/**
	 * here we are creating arrayList for customer and product
	 */
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Product> productList = new ArrayList<Product>();

	/**
	 * here we are creating a method generateCustomerID which help us to
	 * generate the id of the customer who will visit the store
	 * 
	 * @return
	 */
	public int generateCustomerID() {
		// here we are declaring some data type
		int x = 0;// this is for the customer
		int custID = 0;// Initially value of Id the id is 0
		/**
		 * here we are applying the condition to check the size of the
		 * CustomerList
		 */
		if (customerList.size() == 0)//if statement can be followed by an optional else statement which executes when the expression is false
			custID = 1;// for the 1st customer id will be 1
		/**
		 * here we are initializing the list and applying condition to
		 * incrementing the value of previous customer id by 1
		 */
		else {
			for (Customer cust : customerList) {//for loop allows code to be excecuted repeatedly
				x++;//increment is used to add variables easily
				if (x == customerList.size()) {//if statement can be followed by an optional else statement which executes when the expression is false
					custID = cust.getCustomerId() + 1;// here we will increment
					break;//loop gets terminated
				}
			}
		}
		// it will return the id of the customer
		return custID;

	}

	/**
	 * here we are creating a method generateproductID which help us to generate
	 * the id of the Product
	 * 
	 */
	public int generateProductID() {//using integer taking generateProductId
		// here we are declaring some data type
		int x = 0;// this is for product
		int prodID = 0;// Initially value of Id the id is 0
		/**
		 * here we are applying the condition to check the size of the
		 * ProductList
		 */
		if (productList.size() == 0)//if statement can be followed by an optional else statement which executes when the expression is false
			prodID = 1;// for the 1st product id will be 1
		/**
		 * here we are initializing the productList and applying condition to
		 * incrementing the value of previous product id by 1
		 */

		else {
			for (Product prod : productList) {
				x++;
				if (x == productList.size()) {//if statement can be followed by an optional else statement which executes when the expression is false
					prodID = prod.getProductId() + 1;// here we will increment
					break;

				}
			}
		}
		// it will return the id of the customer
		return prodID;

	}

	/**
	 * here we are creating the method addCustomer() which is of return type
	 * 
	 *  name
	 *  contactNo
	 * 
	 */
	public Customer addCustomer(String name, String contactNo) {
		// here we will create the id of the customer
		int custID = generateCustomerID();
		// here we are creating object of the customer
		Customer customer = new Customer(custID, name, contactNo);
		// here we are adding customer list of the retailStore
		customerList.add(customer);
		return customer;
	}

	/**
	 * here we are creating the method addProduct which is of return type
	 * 
	 *  name
	 *  status
	 *  price
	 */
	public void addProduct(String name, String status, double price) {
		// here we will create id of the product
		int prodID = generateProductID();
		// here we are creating object of the product
		Product product = new Product(prodID, name, price);
		// here we are getting the status of the product
		product.getProductStatus();
		// here we are adding the product List of the retailStore
		productList.add(product);
	}

	/**
	 * here we are creating a method checkProductAvailability() which is of
	 * return type,this method gives the idea about the availability of the
	 * product
	 * 
	 *  ProductName
	 * 
	 */
	public int checkProductAvailability(String ProductName) {
		int count = 0;// here we are declaring the product as a count
		// here we are initializing the productList by applying
		// the condition
		for (Product prod : productList) {
			// here we are applying condition for 1st getting the productName
			// and then checking the status
			if (prod.getProductName().equals(ProductName) && (prod.getProductStatus().equals("Available"))) {//if statement can be followed by an optional else statement which executes when the expression is false
				count++;
			}
		}
		// here we applying condition for product availability
		if (count > 0) {//if statement can be followed by an optional else statement which executes when the expression is false
			System.out.println("Available");//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
		}
		// here it will return the product
		return count;

	}

	/**
	 * here we are creating the method display() it will display our
	 * customerList and productList
	 */
	public void display() {
		// here we are initializing our customerList
		for (Customer cust : customerList) {
			System.out.println("Name: " + cust.getCustomerName() + " Number: " + cust.getCustomerNo() + " ID: "
					+ cust.getCustomerId());//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
		} 
			// here we are initializing our productList
		for (Product prod : productList) {
			System.out.println("Name: " + prod.getProductName() + " Price: " + prod.getProductPrice() + " ID: "
					+ prod.getProductId() + " Status: " + prod.getProductStatus());
		} // print statement
	}

	/**
	 * here we creating a method bookProduct() which is of return Type
	 * 
	 * CustomerID
	 *  ProductName
	 *  NumberOfProduct
	 * 
	 */
	public int bookproduct(int CustomerID, String ProductName, int NumberOfProduct) {
		// here we are declaring some data type
		int availProduct = 1;// this is for availProduct initially it is 1
		int count_1 = 0;// here we are taking count to represent the customer
						// initially it is 0
		int count_2 = 0;// here we are taking count to represent the product
						// initially it is 0
		availProduct = checkProductAvailability(ProductName);// this will check
																// the
																// availability
																// of the
																// product
		int count_3 = availProduct;// here we are taking count to represent the
									// availProduct
		int count_4 = NumberOfProduct;// here we are taking count to represent
										// the no of Product
		// here we are initializing our customerList
		for (Customer cust : customerList) {
			count_1++;// incrementing
			// here we are applying condition for getting the customerId
			if (cust.getCustomerId() == CustomerID) {
				// here we are initializing the productList
				for (Product prod : productList) {
					count_2++;// incrementing
					// here we are applying condition for getting the
					// productName
					if (prod.getProductName().equals(ProductName)) {
						// here we are applying two different condition for add
						// book product in the
						// initialize customerList from the availProduct
						if (availProduct <= NumberOfProduct) {
							// here we will add Booked in the customerList
							cust.addBookedProduct(prod);
							count_3--;// decrement availProduct
							// here we are applying condition for availProduct=0
							if (count_3 == 0)
								;
							break;// here we are breaking the condition
						}
						if (availProduct > NumberOfProduct) {
							// here we will add Booked in the customerList
							cust.addBookedProduct(prod);
							count_4--;// decrement no of Product
							// here we are applying condition for no of
							// Product=0
							if (count_4 == 0)
								;
							break;// here we are breaking the condition
						}
						// here we are applying condition if the given product
						// is not
						// available in the productList it will return 0
					} else if (count_2 == productList.size()) {
						availProduct = 0;
						break;// break condition
					}

				}
				// here we are applying condition if the given customer is not
				// available in the customerList it will return -1
			} else if (count_1 == customerList.size()) {
				availProduct = -1;
				break;// break condition

			}
		}
		return availProduct;// return availProduct
	}

	/**
	 * here we are creating method calculateNetAmount() which is of return type
	 * it helps to calculate the amount of booked product
	 * 
	 *  CustomerID
	 * discount
	 * 
	 */
	public double calculateNetAmount(int CustomerID, double discount) {
		double cost = 0;// declaration
		// here we are initializing our customerList
		for (Customer cust : customerList)
			// here we are applying condition for getting the customerId
			if (cust.getCustomerId() == CustomerID) {
				// here we creating arrayList for product were we will
				// put booked product by customer in this arrayList
				ArrayList<Product> prodList1 = cust.bookedProductList;
				// here we are initializing our booked productList
				for (Product prod1 : prodList1) {
					// here we are getting the price of booked product
					cost = prod1.getProductPrice();

				}
				break;// breaking the condition
			}
		System.out.println("the amount is " + cost);//system is used to return code
        //out is a static member
        //println is used to print text and gives output
		// here we applying discount condition
		cost = cost - cost * (discount / 100);

		return cost;// it will return the cost

	}
}
