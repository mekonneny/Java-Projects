/*Yonathan Mekonnen
Introduction to Programming (CMSC-255-002-2016)
Eclipse
Program 7: Bike Shop pt 2
Purpose: to implement a search function that will allow me to look up	
customer information when entering the customer’s last name. Then write a program that reads in a file of	
customer information; prompts the user to enter	a last name; and display any customers with	that last	
name
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
public class Project7 {
	//Create array list of custom
private static ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();
public static void main (String [] args)
{
	printheader();
	//Create Bicycle and Customer object classes
	Bicycle bicycle = new Bicycle();
	Customer customer = new Customer();		
	String fileName;
	if (args.length > 0) {
		   fileName = args[0];
		  } else {
		   fileName = askForFile();
		  }
	//Create token scanner
	File file = new File(fileName);
	Scanner token = null;

	try {
       token = new Scanner(file);
	} catch (FileNotFoundException e) {


	}
	//Create count scanner 
	Scanner count = null;
	
	
	while (token.hasNextLine()){ 
		String fileline = token.nextLine();
		count = new Scanner(fileline);
		String FirstName = "", LastName = "", phonenumber, emailaddress, type, user, frame, brakes, condition, color, brand;
		int wheelSize, weight, numGears;
		
		//Checks if the line has string FirstName and Last name then sets the variable FirstName and LastName to the next string
		if (count.findInLine("Customer: ") != null) {
			FirstName= count.next();
			customer.setFirstName(FirstName);
		    LastName= count.next();
		    customer.setLastName(LastName);
		    //System.out.println("customer= " + customer.getFirstName() + " " + customer.getLastName());
		}
		//Checks if the line has string phonenumber then sets the variable phonenumber to the next string
		if (count.findInLine("Phone: ") != null) {
			phonenumber = count.next();
			phonenumber = phonenumber + " " + count.next();
			customer.setPhoneNumber(phonenumber);
			//System.out.println("phoneNumber= " + customer.getPhoneNumber());
		}
		//Checks if the line has string emailaddress then sets the variable emailaddress to the next string
		if (count.findInLine("Email: ") != null) {
			emailaddress = count.next();
			customer.setEmailAddress(emailaddress);
		 //System.out.println("emailaddress= " + customer.getemail());

		}
		
		
		if (count.findInLine("Number of Bikes: ") != null) {
			int NumofBikes = count.nextInt();
			for (int counter = 0; counter < NumofBikes; counter++) {
				fileline = token.nextLine();
				count = new Scanner(fileline);
				//System.out.println("numOfbikes= " + NumofBikes);
		
				//Checks if the line has string type then sets the variable type to the next string
				if (count.findInLine("type:") != null){
					type = count.next();
					bicycle.setType(Bicycle.BikeType.valueOf(type));
					// System.out.println("type= " + bicycle.getType());
				}
				if (count.findInLine("user:") != null){
					 user = count.next();
					bicycle.setUser(Bicycle.UserType.valueOf(user));
					// System.out.println("user= " + bicycle.getUser());
				}
				
				//Checks if the line has string frame then sets the variable frame to the next string
				if (count.findInLine("frame:") != null){
					 frame = count.next();
					bicycle.setFrame(Bicycle.FrameMaterial.valueOf(frame));
					// System.out.println("frame= " +bicycle.getFrame());
				}	
				//Checks if the line has string brakes then sets the variable brakes to the next string
				if(count.findInLine("brakes:") != null){
					 brakes = count.next();
					bicycle.setBrakes(Bicycle.BrakeType.valueOf(brakes));
					// System.out.println("brakes= " +brakes);			   
				}
				//Checks if the line has string condition then sets the variable condition to the next string
				if (count.findInLine("condition:") != null){
					 condition = count.next();
					bicycle.setCondition(Bicycle.Condition.valueOf(condition));
					// System.out.println("condition= " +condition);
				}
				//Checks if the line has int wheelSize then sets the variable wheelSize to the next int
				if (count.findInLine("wheelSize:") != null){
					  wheelSize = count.nextInt();
					// System.out.println("wheelSize = " + wheelSize);
					bicycle.setWheelSize(wheelSize);
				}
				//Checks if the line has int weight then sets the variable weight to the next int
				if (count.findInLine("weight:") != null){
					 weight = count.nextInt();
					bicycle.setWeight(weight);
					// System.out.println("weight= " + bicycle.getWeight());
				}
				//Checks if the line has int numGears then sets the variable numGears to the next int
				if (count.findInLine("numGears:") != null){
					 numGears = count.nextInt();
					// System.out.println("numGears = " + numGears);
					bicycle.setNumGears(numGears);
				}
				//Checks if the line has string weight then sets the variable weight to the next string
				if(count.findInLine("brand:") != null){
					 brand = count.next();
					// System.out.println("brand = " + brand);
					bicycle.setBrand(brand);
				}
				//Checks if the line has string color then sets the variable color to the next string
				if(count.findInLine("color:") != null){
					 color = count.next();
					// System.out.println("color = " + color);
					bicycle.setColor(color);
				}
				
				customer.addBike(bicycle, NumofBikes);
				bicycle = new Bicycle();
				
			}
			listOfCustomers.add(customer);
			customer = new Customer();
		}
	}
	handleSearchByKey();
	
	}
//Create search method 
public static void handleSearchByKey() {
	Scanner prompt = new Scanner(System.in);
	while(true) {
		boolean choice = false;
		System.out.println("Enter a last name: ");
		String lastName = prompt.nextLine();
		if (lastName.matches("q")) {
			System.out.println("Program is done");
			System.exit(0);
		}
	
		if (!lastName.matches("")) {
			if (lastName != null) {
				for (Customer data : listOfCustomers){
					if (data.getLastName().equals(lastName)) {
						System.out.println(data);
						choice = true;
					}
				}
			}
			//break;
		}
		if (!choice) {
			System.out.println("Could not locate customer information");
		}
	}
}
private static void printheader() {

System.out.println("Yonathan Mekonnen");
System.out.println("Introduction to Programming (CMSC-255-002-2016)");
System.out.println("Bike Shop pt 2");
}
	private static String askForFile() {
		  System.out.println("Enter the file name: ");
		  Scanner input = new Scanner(System.in);
		  return input.nextLine();
		 }
	
	
	private static Scanner openFile(String fileName) throws IOException {
		  File file = new File(fileName);
		  while (!file.exists()) {
		   file = new File(askForFile());
		  }
		  return new Scanner(file);
	}


	
    		
    			   
		
    }

		 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

