import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project4 {

public static void main (String[] args) {
	String fileName = null;
	  if (args.length > 0) {
		   fileName = args[0];
		  } else {
		   fileName = askForFile();
		  }
	  
// File myFile = new File("output.txt");
Scanner outputFile = null;
try {
		  outputFile = openFile(fileName);
} catch (FileNotFoundException e) {
	  e.printStackTrace();
}// change name
ArrayList<Request> listofRequest = new ArrayList<Request>();

Request request = null;
while (outputFile.hasNext()){
	String line = outputFile.nextLine();
	Scanner lineReader = new Scanner (line);
	request = new Request (lineReader.nextInt(),lineReader.nextInt(),lineReader.nextInt(),lineReader.nextInt());
	listofRequest.add(request);
	System.out.println(request);
	
}
}
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
		System.out.println(
				"Purpose:Prompt the user to enter either S or I to see a display of all of the DigitalMedia of that type in alphabetical order");
		System.out.println();
	}

}
