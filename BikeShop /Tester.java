
public class Tester {
	
	public static void main (String [] args){
	    //Create Bicycle and Customer object classes
		Bicycle testBicycle = new Bicycle();	
		Customer testCustomer = new Customer();
		//Use try and catch block to test parameters of WheelSize
		try {
			//test parameter 0
			testBicycle.setWheelSize(0);
		} catch (IllegalArgumentException ex){
			System.out.print("Integer cannot be blank.");
		}
		try {
			//test parameter -1
			testBicycle.setWheelSize(-1);
		} catch (IllegalArgumentException ex){
			System.out.print(ex.getMessage() + " ");
		}
		//test parameter 10
			testBicycle.setWheelSize(10);
			System.out.print(" Expected: 10; Actual: ");
			System.out.println(testBicycle.getWheelSize());
			System.out.println();
			
		//Use try and catch block to test parameters of Weight
			try {
				//test parameter 0
			testBicycle.setWeight(0);
		} catch (IllegalArgumentException ex){
			System.out.print("Integer cannot be blank.");
		}
  
		try {
			//test parameter -1
			testBicycle.setWeight(-1);
		} catch (IllegalArgumentException ex){
			System.out.print(ex.getMessage() + " ");
		}
		//test parameter 5
			testBicycle.setWeight(5);
			System.out.print(" Expected: 5; Actual: ");
			System.out.println(testBicycle.getWeight());
			System.out.println();
			
			//Use try and catch block to test parameters of NumGears
			try {
				//test parameter 0
				testBicycle.setNumGears(0);
			} catch (IllegalArgumentException ex){
				System.out.print("Integer cannot be blank.");
			}
	  
			try {
				//test parameter -1
				testBicycle.setNumGears(-1);
			} catch (IllegalArgumentException ex){
				System.out.print(ex.getMessage() + " ");
			}
			//test parameter 4
				testBicycle.setNumGears(4);
				System.out.print(" Expected: 4; Actual: ");
				System.out.println(testBicycle.getnumGears());
				System.out.println();
				
				//Use try and catch block to test parameters of Brand	
		try {
			//test parameter null
			testBicycle.setBrand(null);
		} catch (NullPointerException ex){
			System.out.print("Brand cannot be blank.");
		}
  
		try {
			//test parameter empty string
			testBicycle.setBrand("");
		} catch (IllegalArgumentException ex){
			System.out.print(ex.getMessage() + " ");
		}
		  //test parameter Mongoose
			testBicycle.setBrand("Mongoose");
			System.out.print(" Expected: Mongoose; Actual: ");
			System.out.println(testBicycle.getBrand());
			System.out.println();
			//Use try and catch block to test parameters of Color
			try {
				//test parameter null
		   testBicycle.setColor(null);
         } catch (NullPointerException ex){
		  System.out.print("Color cannot be blank.");
	}
	  
	  try {
		//test parameter empty string
			 testBicycle.setColor("");
		} catch (IllegalArgumentException ex){
			System.out.print(ex.getMessage() + " ");
	  
		}
	//test parameter Red
	    testBicycle.setColor("Red");
		System.out.print(" Expected: Red; Actual: ");
		System.out.println(testBicycle.getColor());
		System.out.println();
	
		//Use try and catch block to test parameters of FirstName
		  try {
			//test parameter null
				 testCustomer.setFirstName(null);
			} catch (NullPointerException ex){
				System.out.print("First name cannot be blank.");
			}
			  
			  try {
				//test parameter empty string
					 testCustomer.setFirstName("");
				} catch (IllegalArgumentException ex){
					System.out.print( ex.getMessage() + " ");
			  
					//test parameter Yonathan
			    testCustomer.setFirstName("Yonathan");
				System.out.print(" Expected: Yonathan; Actual: ");
				System.out.println(testCustomer.getFirstName());
				System.out.println();
				}
			  
			//Use try and catch block to test parameters of LastName
			  try {
				//test parameter null
					 testCustomer.setLastName(null);
				} catch (NullPointerException ex){
					System.out.print("Last name cannot be blank.");
				}
				  
				  try {
					//test parameter empty string
						 testCustomer.setLastName("");
					} catch (IllegalArgumentException ex){
						System.out.print(ex.getMessage() + " ");
				  
						//test parameter Mekonnen	
				    testCustomer.setLastName("Mekonnen");
					System.out.print(" Expected: Mekonnen; Actual: ");
					System.out.println(testCustomer.getLastName());
					System.out.println();
					}
				//Use try and catch block to test parameters of PhoneNumber
				  try {
					//test parameter null
						 testCustomer.setPhoneNumber(null);
					} catch (NullPointerException ex){
						System.out.print("Phone Number cannot be blank.");
					}
				//test parameter empty string
					  try {
							 testCustomer.setPhoneNumber("");
						} catch (IllegalArgumentException ex){
							System.out.print(ex.getMessage() + " ");
					  
							//test parameter 703-870-0823
					    testCustomer.setPhoneNumber("703-870-0823");
						System.out.print(" Expected: 703-870-0823; Actual: ");
						System.out.println(testCustomer.getPhoneNumber());
						System.out.println();
						}
					//Use try and catch block to test parameters of EmailAddress 
				  try {
					//test parameter null
						 testCustomer.setEmailAddress(null);
					} catch (IllegalArgumentException ex){
						System.out.print(ex.getMessage() + " ");
					}
					  
					  try {
						//test parameter empty string
							 testCustomer.setEmailAddress("");
						} catch (IllegalArgumentException ex){
							System.out.print(ex.getMessage());
					  
							//test parameter mekonneny@vcu.edu
					    testCustomer.setEmailAddress("mekonneny@vcu.edu");
						System.out.print(" Expected: mekonneny@vcu.edu; Actual: ");
						System.out.println(testCustomer.getemail());
						System.out.println();
						}
	}
	
}

