//JFM1T3_Assignment5:
/*
1.Write a program to initialize a boolean variable and print it's opposite value on console.

  Sample Input:true

  Expected Output:false

*/

import java.util.Scanner;

public class BooleanOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean inputValue = scanner.nextBoolean();
      System.out.println(!(inputValue));
      
    }
}
//Define main method

//Declare a variable and initialize it as true or false 

//Print the Result using not operator 
//Good
