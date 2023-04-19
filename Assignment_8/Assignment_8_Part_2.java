/*
Name: Aniket Singh
Prn: 21070126013
Problem Statement: Part 2:
Define an exception class called “NOMATCHEXCP” that is thrown when the string from the keyboard is not equal to “India”. Write a Demo program using try-catch block that shows the use of this user-defined exception. Class NOMATCHEXCP should have a parameterized constructor and the exception message generated should show the line number and the erroneous String that was inputted by the user.
 */

// package declaration
package Com.College;
import java.util.Scanner;
// main class
public class Assignment_8_Part_2 {
    public static void main(String[] args) {
        // create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);
        try {
            // prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // check if the input string is equal to "India", throw a custom exception otherwise
            if (!input.equals("India")) {
                throw new NOMATCHEXCP(8, input); // assuming this line number is where the user input is taken
            }

            // print a message if the input string matches "India"
            System.out.println("Input string matches \"India\"");
        } catch (NOMATCHEXCP e) {
            // handle the custom exception thrown when the input string does not match "India"
            System.out.println(e.getMessage());
        }
    }
}
// custom exception class that extends the Exception class
class NOMATCHEXCP extends Exception {
    NOMATCHEXCP(int line, String input) {
        super("Error on line " + line + ": Input string \"" + input + "\" does not match \"India\"");
    }
}
