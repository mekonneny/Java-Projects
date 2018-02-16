import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MediaList {
	
 public static void main(String[] args)  {
	printheading();
	 //Creating ArrayLists 
	 ArrayList < DigitalMedia > list = new ArrayList<DigitalMedia>();
	  ArrayList < DigitalMedia > list2 = new ArrayList<DigitalMedia>();
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
  }

  
  Song song = null;
  int count = 0;
//Creating object of songs and images and storing it into the ArrayList
  try { 
  while (outputFile.hasNextLine()) {
   String line = outputFile.nextLine();
   Scanner scan = new Scanner(line);
   if (line.charAt(0) == 'S' || line.charAt(0) == 's') {
    if (!line.contains(".")) {
      scan.skip(line);
      count++;
     } else {
    	String ignore = null;
      	StringTokenizer token = new StringTokenizer(line, ":");
      	while (token.hasMoreTokens()) { 
      	ignore = token.nextToken().trim();  
        song = new Song(token.nextToken().trim(), token.nextToken().trim(), 
        token.nextToken().trim(), Long.parseLong(token.nextToken().replaceAll(",", "").trim()));

     list.add(song);
     }
     }
   }
    Image image = null;
    if (line.charAt(0) == 'I' || line.charAt(0) == 'i') {
        if (!line.contains(".") || line.indexOf('.', line.indexOf('.') + 1) != -1) {
          scan.skip(line);
          count++;
         } else {
          String ignore = null;
          StringTokenizer token = new StringTokenizer(line, ":");
          while (token.hasMoreTokens()) {  
           ignore = token.nextToken().trim();
           image = new Image(token.nextToken().trim(), Integer.parseInt(token.nextToken().trim()), 
           Integer.parseInt(token.nextToken().trim()), Long.parseLong(token.nextToken().replaceAll(",", "").trim()));
           
        list2.add(image);
    
          }
         }
 
          }
          }
  System.out.println("amount of errors: " +count);

 } catch (IllegalArgumentException e) {
	 e.printStackTrace();
 }
// Prompting user to enter their desired letter and creating a while loop to repeat until exiting the program
  String str = "Enter S to see all of the songs, Enter I to see all of the images, Enter Q to quit the program";
  System.out.println(str);
  Scanner scan = new Scanner(System.in);
  String input = scan.nextLine();
  while (!input.equals("Q")) {
	  searchMethod (list, list2,input );
	  System.out.println(str);
	  input= scan.nextLine();
  }
  
  System.out.print("The program has ended");
 }
 //Search method(searching through song and image objects)
 public static void searchMethod(ArrayList<DigitalMedia> list, ArrayList<DigitalMedia> list2, String s ){
	 
  if (s.equals("S") || s.equals("s")) {
	  ArrayList<Song> songtype = new ArrayList<Song>();
	  for (DigitalMedia print : list){
	    if(print instanceof Song)
	     songtype.add((Song) print);
  }
	  Collections.sort(songtype); 
	  for( int i= 0;  i < songtype.size(); i++)
		  System.out.println(songtype.get(i));
  }
  if (s.equals("I") || s.equals("i")) {
	  ArrayList<Image> imagetype = new ArrayList<Image>();
	  for (DigitalMedia print : list2){
		  if(print instanceof Image)
		     imagetype.add((Image) print);
	  }
	  Collections.sort(imagetype); 
	  for( int i= 0;  i < imagetype.size(); i++)
	  System.out.println(imagetype.get(i));

 }
}
 //asking user for filename
 private static String askForFile() {
	  System.out.println("Enter the file name: ");
	  Scanner input = new Scanner(System.in);
	  return input.nextLine();
	 }
	 //making sure the file is correct
	 private static Scanner openFile(String fileName) throws FileNotFoundException {
	  File file = new File(fileName);
	  while (!file.exists()) {
	   file = new File(askForFile());
	  }
	  return new Scanner(file);
	 }
	 
	 public static void printheading() 
		{
		 System.out.println("Yonathan Mekonnen");
		 System.out.println("Date Structures and Object Programming (CMSC 256)");
		 System.out.println("Eclipse");
		 System.out.println("Program 2");
	     System.out.println("Purpose:Prompt the user to enter either S or I to see a display of all of the DigitalMedia of that type in alphabetical order");
	     System.out.println(); 
		}
}

 
 
 