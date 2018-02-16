/* Yonathan Mekonnen
   Introduction to Programming (CMSC-255-002-2016)
   Dr. Java
   Program 6: Bike Shop, part 1
   Purpose: to design a data type using abstraction that models a bicycle 
 */
public class Bicycle {

public static final String BrakesType = null;
//Create global variables for objects
private BikeType type;
private UserType user;
private FrameMaterial frame;
private BrakeType brakes; 
private Condition condition;
private int wheelSize;
private int weight; 
private int numGears;
private String brand;
private String color;

//Create enumeration types for classes specified as need be enums 
public enum BikeType
{
	Road, Mountain, Hybrid, Cruiser 
}
public enum UserType 
{
	Men, Women, Boys, Girls
}
public enum FrameMaterial
{
Steel, Aluminum, Carbon
	
}
public enum BrakeType
{
	Caliper, Cantilever, LinearPull, Disc
}

public enum Condition 
{
	New, Used
}

//Default Constructors
public Bicycle() 
{
	type = BikeType.Road;
	user = UserType.Men;
	frame = FrameMaterial.Steel;
	brakes = BrakeType.Caliper;
	condition = Condition.New;
	wheelSize = 0;
	weight = 0;
	numGears = 0;
	color = "unknown";
	brand = "unknown";
}

//Instance Variables 
public Bicycle (BikeType type, UserType user, FrameMaterial frame, BrakeType brakes, 
Condition condition, int wheelSize, int weight, int numGears, String brand, String color) {
	setType(type);
	setUser(user);
	setFrame(frame);
	setBrakes(brakes);
	setCondition(condition);
	setWheelSize(wheelSize);
	setWeight(weight);
	setNumGears(numGears);
	setBrand(brand);
	setColor(color);
	
}
// set the global variable type to the parameter in the set method 
public void setType(BikeType type)
{
this.type = type;
}
//Use get method to return what you set the parameter in the set method
public BikeType getType()
{
return type;
}

//set the global variable user to the parameter in the set method 
public void setUser(UserType user)
{
	this.user = user;
}
//Use get method to return what you set the parameter in the set method
public UserType getUser()
{
	return user;
}

//set the global variable frame to the parameter in the set method 
public void setFrame(FrameMaterial frame)
{
	this.frame = frame;
}
//Use get method to return what you set the parameter in the set method
public FrameMaterial getFrame()
{
	return frame; 
}
//set the global variable brakes to the parameter in the set method 
public void setBrakes(BrakeType brakes)
{
	this.brakes = brakes;
}
//Use get method to return what you set the parameter in the set method
public BrakeType getBrakes()
{
	return brakes;
}

//set the global variable condition to the parameter in the set method 
public void setCondition(Condition condition)
{
this.condition = condition; 	
}

//Use get method to return what you set the parameter in the set method
public Condition getCondition()
{
	return condition; 
}

//set the global variable Wheelsize to the parameter in the set method 
public void setWheelSize(int Wheelsize)
{
	//Create an exception if int is not 10 or 12 or 14 or 16 or 18 or 20 or 24 or 26 or 29
if (Wheelsize == 10 || Wheelsize == 12 || Wheelsize == 14 || Wheelsize == 16 || Wheelsize == 18 ||
Wheelsize == 20 || Wheelsize == 24 || Wheelsize == 26 || Wheelsize == 29)
{
this.wheelSize = Wheelsize;

}else throw new IllegalArgumentException("Try Again and enter a valid Wheelsize");
}

//Use get method to return what you set the parameter in the set method
public int getWheelSize()
{
	
	return wheelSize;
}
//set the global variable weight to the parameter in the set method 
public void setWeight(int weight)
{
	//Create an exception if int is less than 0
	if (weight <= 0)
		throw new IllegalArgumentException("Try Again and enter a valid weight");
	
		this.weight = weight;
}

//Use get method to return what you set the parameter in the set method
public int getWeight()
{
	return weight; 
}
//set the global variable numGears to the parameter in the set method 
public void setNumGears(int numGears)
{
	//Create an exception if int is less than 0
	if (numGears <0)
		throw new IllegalArgumentException("Try Again and enter a valid numGears");
	this.numGears = numGears;
}
//Use get method to return what you set the parameter in the set method
public int getnumGears()
{
	return numGears;
}
//set the global variable brand to the parameter in the set method 
public void setBrand(String brand){
if (!brand.matches("[a-zA-Z]+")){
	throw new IllegalArgumentException("Try Again and enter a valid first name");
} else {
	this.brand = brand; 
}
}
//Use get method to return what you set the parameter in the set method
public String getBrand()
{
	return brand;
}

//set the global variable color to the parameter in the set method 
public void setColor(String color){
if (!color.matches("[a-zA-Z]+")){
	throw new IllegalArgumentException("Try Again and enter a valid first name");
} else {
	this.color = color; 
}
}

//Use get method to return what you set the parameter in the set method
public String getColor()
{
	return color;
}

// Convert the enums to string and print out all of the variables 
public String toString() {
	
	String output = "Bicycle [{" + "type=" + type.toString() + ", user=" + user.toString() + ", frame=" + frame.toString() + ", \n "

	+ "brakes=" + brakes.toString() + ", condition=" + condition.toString() + ", wheelSize=" + wheelSize + ", \n"

	+ "weight=" + weight + ", numGears=" + numGears + ", brand=" + brand + ", color=" + color + "}]\n" + "\n";
	
	return output;
}


 




}