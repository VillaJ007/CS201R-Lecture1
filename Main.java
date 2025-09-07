import java.util.Scanner;

//Name: Julio Villarreal
//Date: 9/6/2025
// Assignment 1 
//Lecture: CS201R
//Lab: CS201L
//LabTime: 12:00 PM

public class Main {

    public static void main(String[] args) {
    
    //create variables

    Scanner scanner = new Scanner(System.in);
    int inValue;

    //practice input
    System.out.println("Please enter your next value: ");
    inValue = scanner.nextInt();
    System.out.println("Why did you enter " + inValue + "?");

    //setting up other variable types
    char letter = 'A';
    String words = "The Words";

    //LECTURE 1
    //add code to input a string replacing the variable 
    //words with the input value
    System.out.println("Please enter your next value: ");
    words = scanner.next();
    //print the string
    System.out.println("You entered " + words + ".");




    //add code to input a new value for the variable
    //letter
    System.out.println("Enter a new value: ");
    String newValue = scanner.next();
    newValue = newValue.toUpperCase();
    letter = newValue.charAt(0);
    System.out.println("You entered " + letter + ".");


    //LECTURE 2
    //if the letter entered is A or B - print "You did GREAT!"
    //if the letter is C - print "You did GOOD!"
    //if the letter is D or F - print "Try again"
    //if the letter is something else, print "Incorrect value"
    if (letter == 'A'|| letter == 'B') {
      System.out.println("You did GREAT!");
    } else if (letter == 'C') {
      System.out.println("You did GOOD!");
    } else if (letter == 'D' || letter == 'F') {
      System.out.println("Try again");
    } else { 
      System.out.println("Incorrect value");
    }  

    //LECTURE 1
    //this is demonstrating different values
    System.out.println("\u03B1" + "   " + 0b1111);
    

    //LECTURE 1
    //formatting values for output
    double value = 16.404674;
    System.out.printf("Value is $%4.2f", value);

    scanner.close();
  }

}
