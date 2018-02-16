import java.util.*;
import java.io.*;

  public class ReactionAnalysis
{
    private static Scanner number = new Scanner(System.in);
  public static void main (String [] args) throws FileNotFoundException
  {  
    Scanner fileReader = new Scanner(new File ("movieReviews.txt"));
    printHeading();
    calling();
    menu();
    firstMethod(number, fileReader);
  }
  
   public static void calling() throws FileNotFoundException{
 
    System.out.println("Enter a word: ");
    
    Scanner scan = new Scanner(System.in);
   
    String word = scan.nextLine();
    File filereview = new File ("movieReviews.txt");
    Scanner fileReader = new Scanner(filereview);
   }
   
 //(new File ("movieReviews.txt"));
  private static void printHeading() 
  {
   System.out.println("Yonathan Mekonnen");
   System.out.println("Introduction to Programming (CMSC-255-002-2016)");
   System.out.println("Dr. Java");
   System.out.println("Program 4: Reaction Analysis");
   System.out.println("Purpose: ");
   System.out.println("The input will be sentences and the output will display those sentences and number them in chronological order");
  }
    
  public static void menu()
  {
  System.out.println("What would you like to do?");
  System.out.println("1: Get the score of a word");
  System.out.println("2. Get the average score of words in a file ( one word per line)");
  System.out.println("3. Find the highest/lowest scoring words in a file");
  System.out.println("4. Sort words from a file into positive.txt and negative.txt");
  System.out.println("5. Exit the program");
   System.out.println(" Enter a number 1-5:");
  }
  

    public static void run()
    {
     Scanner number = new Scanner(System.in);
   
   String num = number.nextLine();
  
  if (num.equals("1"))
  {
    System.out.println("Get the score of a word:");
  }
  else if (num.equals("2"))
  {
    System.out.println("Get the average score of words in a file ( one word per line)");
  }
 else if (num.equals("3"))
 {
   System.out.println("Find the highest/lowest scoring words in a file");
 }
 else if (num.equals("4"))
 {
   System.out.println("Sort words from a file into positive.txt and negative.txt");
 }
    }

  public static int firstMethod (Scanner input, Scanner filescan)
  {
   System.out.println("Enter a word: ");
   String letter = input.nextLine();
   
   int wordCount = 0;
     while (filescan.hasNext())
     {
     String word = filescan.nextLine();
     if (word.contains(letter)) {
       wordCount ++;
     }
      // filescan.close();
       //java.util.Scanner.close()
          
     }
   //filescan.close();
     filescan.close();
     return wordCount; 
  }
  
  filescan.close(); 

  
  
  
  
  
  
  
  
  }
  
  