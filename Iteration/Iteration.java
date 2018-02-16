/* Yonathan Mekonnen
   Introduction to Programming (CMSC-255-002-2016)
   Dr. Java
   Project 1 */
import java.io.*;
import java.util.*;

 public class Iteration2
 {
public static void main (String[] args) throws IOException
  {
  System.out.println("Enter the file name: ");
  Scanner input = new Scanner(System.in);
  String filename = input.nextLine();

  try{
  FileReader inReader = new FileReader(filename);
  Scanner inFile = new Scanner(inReader);
  int i = 0;
  while(inFile.hasNextLine()){
  i++;
  String str = inFile.nextLine();
  System.out.println(i + ". " + str);
  }
  i++;
  }
  catch (IOException gotYa){
  System.err.println("The file " + filename + " is not found.");
  }
  }
 }