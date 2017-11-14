import java.util.Scanner;

public class Main {

    /**

     * Task:
     The variables i, d ,and s are already declared and initialized. You must:
     1.Declare 3 variables: one of type int, one of type double, and one of type String.
     2.Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3 variables.
     3.Use the + operator to perform the following operations:
        1.Print the sum of i plus your int variable on a new line.
        2.Print the sum of d plus your double variable to a scale of one decimal place on a new line.
        3.Concatenate s with the string you read as input and print the result on a new line.

     * Input format:
     The first line contains an integer that you must sum with i.
     The second line contains a double that you must sum with d.
     The third line contains a string that you must concatenate with s.

     * Output format:
     Print the sum of both integers on the first line, the sum of both doubles (scaled to 1 decimal place) on the second line, and then the two concatenated strings on the third line.

     * Sample input:
     12
     4.0
     is the best place to learn and practice coding!

     * Sample output:
     16
     8.0
     HackerRank is the best place to learn and practice coding!

     */

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        //Declare second integer, double and String variables.
        int a;
        double b;
        String c;

        //Read and save and integer, double and String to your variables.
        System.out.println("Input the int: ");
        a = scanner.nextInt();
        System.out.println("Input the double: ");
        b = scanner.nextDouble();
        System.out.println("Input the string: ");
        c = scanner.next() + scanner.nextLine();

        //Print the sum of both integer variables on a new line.
        System.out.println(i + a);

        //Print the sum of the double variables on a new line.
        System.out.println(d + b);

        //Concatenate and print the String variables on a new line;
        //the 's' variable above should be printed first.
        System.out.println(s + c);

        scanner.close();
    }
}
