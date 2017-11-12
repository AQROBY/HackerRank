import java.util.Scanner;

public class Main {

    /**
     * Save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.
     * Input format: A single line of text denoting inputString (the variable whose contents must be printed).
     * Ouput format: Print Hello, World. on the first line, and the contents of inputString on the second line.
     * Sample input: "Welcome to 30 Days of Code!"
     * Sample output: "Hello, World.
                       Welcome to 30 Days of Code!"
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Create a scanner object to read input from the standard input stream System.in
        System.out.println("Sample input: ");     //Print out a message for the user to introduce the input sample
        String inputString = scanner.nextLine();  //Establishing the scanner logic - read the  full line from System.in and save it in the variable inputString
        scanner.close();                          //Closing the scanner to make sure there will be no memory leaks
        System.out.println("Hello, world!");      //Print out the initial string using the standard output stream System.in
        System.out.println(inputString);          //Print out the string that the user gave as the input

    }
}
