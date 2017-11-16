
import java.util.Scanner;

public class Main {

    /**
     * Task
     Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and
     tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

     *Input Format
     There are 3 lines of numeric input:
     The first line has a double, mealCost (the cost of the meal before tax and tip).
     The second line has an integer, tipPercent (the percentage of mealCost being added as tip).
     The third line has an integer, taxPercent (the percentage of mealCost being added as tax).

     *Output Format
     Print 'The total meal cost is totalRoundedCost dollars', where totalRoundedCost is the rounded integer result of the entire bill
     (mealCost with added tax and tip).

     *Sample Input
     12.00
     20
     8

     *Sample Output
     The total meal cost is 15 dollars.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Input of the meal value, original value, tip and tax
        System.out.println("How much did the meal cost?");
        double mealCost = scanner.nextDouble();
        System.out.println("How much is the tip percentage?");
        int tipPercent = scanner.nextInt();
        System.out.println("How much is the tax percentage?");
        int taxPercent = scanner.nextInt();
        scanner.close();

        //Calculations
        double tip = (mealCost * tipPercent / 100);
        double tax = (mealCost * taxPercent / 100);
        double totalCost = mealCost + tip + tax;

        //Casting the result of the rounding operation to an int and save it as totalCost
        int totalRoundedCost = (int) Math.round(totalCost);

        //Printing the result
        System.out.println("The total meal cost is " + totalRoundedCost + " dollars");
    }
}
