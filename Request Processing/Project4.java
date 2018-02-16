/*Yonathan Mekonnen
  Date Structures and Object Programming (CMSC 256)
  Eclipse
  Program 4
  Purpose: To write a program to simulate forms processing by an office clerk
  Input: a text file with requests 
  Output: the average weight times in the input queue and the pending requests stack
   */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Project4 {

	//command line argument
public static void main (String[] args)
{
	printheading();
	String fileName = null;
	  if (args.length > 0) {
		   fileName = args[0];
		  } else {
		   fileName = askForFile();
		  }
	  

Scanner outputFile = null;
try {
		  outputFile = openFile(fileName);
} catch (FileNotFoundException e) {
	  e.printStackTrace();
}// Create ArrayList 
ArrayList<Request> listofRequest = new ArrayList<Request>();

Request request = null;
while (outputFile.hasNext()){
	String line = outputFile.nextLine();
	Scanner lineReader = new Scanner (line);
	request = new Request (lineReader.nextInt(),lineReader.nextInt(),lineReader.nextInt(),lineReader.nextInt());
	listofRequest.add(request);
	System.out.println(request);
	
	//create Queue
	PriorityQueue<Request> myNumbers = new PriorityQueue<Request>();
	
	
	//create stack 
	Stack myStack = new Stack();
   
    //create clerk object 
    Clerk clerk = new Clerk(); 
   
   
    
    
    int clock = 0;
    int counter = 0;
    while (!doneTime(myNumbers)){
    	clock++; 
    	Request current = listofRequest.get(counter);
    	if (clock == current.getEntryTime()){
    		counter ++;
    		myNumbers.add(current);
    		if(!myStack.empty()){
    			clerk.processRequest(current);
    		}
    	}
    }
   
}
}

public static boolean doneTime(PriorityQueue<Request> queue){
    while (queue.isEmpty()){
    	return false;
    }
    return true;
}
    //asking user for filename
	private static String askForFile() {
		System.out.println("Enter the file name: ");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	// making sure the file is correct
	private static Scanner openFile(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		while (!file.exists()) {
			file = new File(askForFile());
		}
		return new Scanner(file);
	}
	
     
	public static void printheading() {
		System.out.println("Yonathan Mekonnen");
		System.out.println("Date Structures and Object Programming (CMSC 256)");
		System.out.println("Eclipse");
		System.out.println("Program 4");
		System.out.println("Purpose : To write a program to simulate forms processing by an office clerk");
		System.out.println();
	}

}
