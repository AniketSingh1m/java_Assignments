/*
Name: Aniket Singh
Prn: 21070126013
Problem Statetment:Part 1:
Write a Java Program to find the factorial of ‘n’ integers (as command line arguments CLA). Write your own exception “FactorialException” to validate integer values to be in certain range. Sample call: java ExceptionDemo 8 – 6 14 abcd 5
1) Static main method invokes another method “factorial()”
2) CLA which are strings but interpreted as integer values.
3) The user-defined exception class
 */
package Com.College;
// custom exception class that extends the Exception class
import java.util.*;
class MyExcep extends Exception {
    MyExcep(String message) {
        super(message);
    }
}
// main class
public class Assignment_8_Part_1 {
    public static void main(String[] args) {
        // iterate through the command line arguments provided
        for (String arg : args) {
            try {
                // convert the argument to an integer
                int n = Integer.parseInt(arg);
                // if the argument is out of range, throw a custom exception
                if (n < 1 || n > 10) {
                    throw new MyExcep("Value out of range (1 to 10) for " + n);
                }
                // print the factorial of the argument if it is within the range
                System.out.println("Factorial of " + n + " is " + factorial(n));
            } catch (NumberFormatException e) {
                // handle the case where the argument cannot be parsed as an integer
                System.out.println("Invalid input: " + e.getMessage());
            } catch (MyExcep e) {
                // handle the custom exception thrown when the argument is out of range
                System.out.println(e.getMessage());
            }
        }
    }

    // helper function to compute the factorial of a number
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

