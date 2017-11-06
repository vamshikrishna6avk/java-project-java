package storeManagement;//in package storeManagement creating another class


import java.util.Scanner;//import keyword is used to import built-in and user defined packages into our java source file so that our class can refer to class thath is in another package by directly using its name
//java.util is a built-in package that consists of large number of classes which are part of javaAPI(application programming interface,is a list of classes that are part of JDK
//scanner is a class in java.util package used for obtaining input of promitive types like int,double,float etc
//scanner is a predefined class for taking inputs from user
/**
 * here we are creating the class RetalShop here we will perform our main
 * function
 *
 */
public class RetailShop {//created another class retailshop
	// here we creating the main method
	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
		   //Here static a keyword which identifies class related thing
		  //void is used to define return type of the method,void means method wont return any value
		  //main is name of method
		  //declares method String[]
		 //String[]args means arguments will be passed into main method and says that main() as parameter
		// here we are creating the object of the RetailStore Class
		RetailStore store = new RetailStore("Spencer");//using new keyword created object as Retailstore
		// here we are creating the scanner for taking the input from
		// the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");// print statement
		String name = sc.nextLine();// here we are taking the name from the user
                     /** by nextline a blankline will be read in as an empty String **/
		System.out.println("Ener your Contact No:");
		String contactNo = sc.nextLine();// here we are taking the contact no from
										// the user
		// here we are creating object for the customer class
		Customer customer = store.addCustomer(name, contactNo);//stores name and contact no
		int customerId = customer.getCustomerId();// here we will get the id
													// from the customer

		// here we are adding some product in the productList
		store.addProduct("Television", "Available", 15000);
		store.addProduct("Refrigerator", "Available", 12000);
		store.addProduct("MicroOven", "Available", 8000);
		
		System.out.println("******************************");//system is used to return code
        //out is a static member
        //println is used to print text and gives output

		System.out.println("Spencer Home Appliances.");// print
		
		System.out.println("******************************");
																			// statement
		// here we are calling display method
		store.display();//displays store properties
		System.out.println("Please Enter the ProductName:");// print statement
		String productName = sc.next();// here we are getting the productName
										// from the user
		System.out.println("Enter the no of Product:");// print statement
		int NumberOfProduct = sc.nextInt();
		/** nextint() scans or reads the incoming input
		* sees that input is not an integer and throws an exception**/
		// here we are getting the no of
											// product from the user
		// here we are put the the whole information about the store and booked
		// product in the r
		int r = store.bookproduct(customerId, productName, NumberOfProduct);
		System.out.println(r);//system is used to return code
        //out is a static member
        //println is used to print text and gives output
		// here we are applying condition for checking some specific case
		while (r == 0) {//using while loop
			/**while loop,checks condition first if it returns true then statement inside while loop execute,if it is false comes out of of loop**/
			System.out.println("Entered product is not available in the productlist");// print
																						// statement
			store.display();// here we are calling display method
			System.out.println("Please Enter the valid Product: ");// print
																	// statement
			productName = sc.next();// here we are getting the productName from
									// the user
			r = store.bookproduct(customerId, productName, NumberOfProduct);

		}
		sc.close();// here we will close our scanner

		System.out.println("Net Amount" + store.calculateNetAmount(customerId, 10));//system is used to return code
        //out is a static member
        //println is used to print text and gives output

	}

}