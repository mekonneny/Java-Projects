/* Yonathan Mekonnen
   Introduction to Programming (CMSC-255-002-2016)
   Dr. Java
   Program 6: Bike Shop, part 1
   Purpose: to design a data type using abstraction that models a bicycle 
 */
import java.util.ArrayList;

public class Customer {
//Create global variables
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private ArrayList<Bicycle> bikes = new ArrayList<Bicycle>();
	
//Defualt Constructors
public Customer() {
	firstName = "unknown";
	lastName = "unknown";
    phoneNumber = "unknown";
    email = "unknown";
    
}
//Instance variables 

public Customer (String firstName, String lastName, String phoneNumber, String emailaddress, ArrayList bike)
{
	firstName = this.firstName;
	lastName = this.lastName;
	phoneNumber = this.phoneNumber;
	emailaddress = this.email;
	bikes = bike;
}
 


//set the global variable first to the parameter in the set method 
public void setFirstName(String firstName)
 {
	//Create an exception if string doesn't have a-zA-Z
    	if (!firstName.matches("^[\\p{L} . '-]+$")){
    		throw new IllegalArgumentException("Try Again and enter a valid first name");
    	} else {
    		this.firstName = firstName; 
    	}
	
	
	
	
 }
//Use get method to return what you set the parameter in the set method
  public String getFirstName()
    {
    	return firstName;
    }
//set the global variable first to the parameter in the set method 
  public void setLastName (String lastName)
  {
	  //Create an exception if string doesn't have a-zA-Z
	  if (!lastName.matches("^[\\p{L} . '-]+$")){
		  throw new IllegalArgumentException("Try Again and enter a valid last name");
	  } else {
	  
     	this.lastName = lastName; 
  }
  }
//Use get method to return what you set the parameter in the set method
   public String getLastName()
     {
     	return lastName;
     }
 //set the global variable first to the parameter in the set method 
   public void setPhoneNumber (String phoneNumber)
   {
	   //Create an exception if string is number less than 0
	   if (!phoneNumber.matches("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$")){
		   throw new IllegalArgumentException("Try Again and enter a valid phone number");
	   } else {
	   
      	this.phoneNumber = phoneNumber; 
   }
   }
 //Use get method to return what you set the parameter in the set method
    public String getPhoneNumber()
      {
      	return phoneNumber;
      }
  //set the global variable first to the parameter in the set method 
    public void setEmailAddress (String email)
    {
       	this.email = email; 
    }
  //Use get method to return what you set the parameter in the set method
     public String getemail()
       {
       	return email;
       }
//add the increments of bike class
     public void addBike (Bicycle bike, int Numofbikes)
     {
    
    		 bikes.add(bike);
    	
     
     }
      //print out the object classes
     public String toString() {
    		
    		String output = "Customer: "  + firstName + " " + lastName + "\nPhone Number= " + phoneNumber + "\nEmail= " + email 
    				+ "\n" + firstName + "'s Bikes:\n";
    		printTheBicycle();
    		
    		return output;
    	}

     public void printTheBicycle() {
    	 for (int j = 0; j < bikes.size(); j++){
    		 if(bikes.size() == 0){
    			 System.out.println("Customer owns no bicycles!");
    		 } 
    		 else {
    			 System.out.println(bikes.get(j));
    		 }
    	 }
     }













}
