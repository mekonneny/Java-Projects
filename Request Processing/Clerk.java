/*Yonathan Mekonnen
  Date Structures and Object Programming (CMSC 256)
  Eclipse
  Program 4
  Purpose: To write a program to simulate forms processing by an office clerk
  Input: a text file with requests 
  Output: the average weight times in the input queue and the pending requests stack
   */
public class Clerk {
   
	private boolean isActive = true;
    
    private int time = 0;

    
    public void clerk() {
    	this.time = 0;
	}
    
	public boolean isActive() {
	 return true;
}
	public void deactivate() {
	
	}
	
	public void processRequest(Request request){
	int counter = 0; 
	System.out.println(counter);
}
	
public void incrementTime() {
	
}
// Use get method to return what you set the parameter in the set method
public int getTime() {
	return time;
}


}