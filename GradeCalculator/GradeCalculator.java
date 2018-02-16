import java.util.*;

public class GradeCalculator 
{
  
  public static void main( String [] args)
  {
   /*Yonathan Mekonnen
    CMSC 255
    Project 2
    Grade Calculator
    This program is made to combine the total score of all the assignments and present the final grade revieced*/

    Scanner input = new Scanner(System.in);
    
    // Homework and Labs, takes input and calculates sum
    System.out.println ("Enter the amount of points earned on your homework assignments and labs: ");
    
    while(!input.hasNextDouble()){
      System.out.println(" Error, please input a valid number");
         input.next();
    }
    double homeworkLab = input.nextDouble(); 
   
      
    System.out.println ("Now enter the total of amount of points possible to earn for assignments and labs: ");
    
    while(!input.hasNextDouble()){
      System.out.println(" Error, please input a valid number");
         input.next();
    }
    double homeworkLabtotal = input.nextDouble();
    
     
      double homeworkLabsum = ((homeworkLab/homeworkLabtotal) * .15);
   
 
    // Programming Projects, takes input and calcuates sum 
    System.out.println ("Enter the amount of points earned on your programming assignments: ");
     
    while(!input.hasNextDouble()){
      System.out.println(" Error, please input a valid number");
         input.next();
    }
    double programming = input.nextDouble();
  
    
    System.out.println ("Now enter the total of amount of points possible to earn for your programming assignments: ");
   
    while(!input.hasNextDouble()){
      System.out.println(" Error, please input a valid number");
         input.next();
    }
    double programmingTotal = input.nextDouble();
   
     
      double programmingSum = ((programming/programmingTotal) * .35);
  
    
   // Test One, takes input and calcuates sum 
    System.out.println ("Enter the amount of points earned on your first test: ");
    while(!input.hasNextDouble()){
      System.out.println(" Error, please input a valid number");
         input.next();
    }
  
    double firstTest = input.nextDouble();
    
      System.out.println ("Now enter the total of amount of points possible to earn on your first test: ");
     
      double firstTesttotal = input.nextDouble();
   
      double firstTesttotalSum = ((firstTest/firstTesttotal) * .15);
   
    
    // Test Two, takes input and calcuates sum 
    System.out.println ("Enter the amount of points earned on your second test: ");
   
    while(!input.hasNextDouble()){
      System.out.println(" Error, please input a valid number");
         input.next();
    }
   
    double secondTest = input.nextDouble();
    
      System.out.println ("Now enter the total of amount of points possible to earn on your second test: ");
   
      double secondTesttotal = input.nextDouble();
     
      double secondTesttotalSum = ((secondTest/secondTesttotal) * .15);
   
    
    // Final Exam, takes input and calcuates sum 
    System.out.println ("Enter the amount of points earned on your final exam: ");
    
    while(!input.hasNextDouble()){
      System.out.println(" Error, please input a valid number");
         input.next();
    }
   
    double finalExam = input.nextDouble();
    
      System.out.println ("Now enter the total of amount of points possible to earn on the final exam: ");
     
      double finalExamtotal = input.nextDouble();
    
      double finalExamtotalSum = ((finalExam/finalExamtotal) * .20);
   
   
   double finalGradetotalSum = ((homeworkLabsum + programmingSum + firstTesttotalSum + secondTesttotalSum + finalExamtotalSum) * 100);
 


  
   if ( finalGradetotalSum >= 90 & finalGradetotalSum<= 100)
  {
      System.out.println("Good job! You recieved an A");
    } 
    
   else if (finalGradetotalSum >= 80)
   {
      System.out.println( "Congrats, you recieved a B");
    } 
    
   else if (finalGradetotalSum >= 70)
   {
      System.out.println( "You have recieved a C");
    } 
     
   else if (finalGradetotalSum >= 60)
   {
      System.out.println( "You have recieved a D");
    } 
      
   else
   {
     
     System.out.println("You have recieved a F");
    } 
  
   System.out.printf("Your final grade is " + "%.1f%%", finalGradetotalSum);
   
   
   }
     }