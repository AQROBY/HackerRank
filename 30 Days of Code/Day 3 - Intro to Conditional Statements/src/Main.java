import java.util.Scanner;

public class Main {

    /**
     * Task
     Given an integer n, perform the following conditional actions:
        If n is odd, print 'Weird'
        If n is even and in the inclusive range of 2 to 5, print 'Not Weird'
        If n is even and in the inclusive range of 6 to 20, print 'Weird'
        If n is even and greater than 20, print 'Not Weird'

     * Input Format
     A single line containing a positive integer, n

     * Constraints
     1 <= n <= 100

     * Output Format
     Print 'Weird' if the number is weird; otherwise, print 'Not Weird'

     * Sample Input 0 = '3' -> Sample Output 0 = 'Weird'
     * Sample Input 1 = '24' -> Sample Output 1 = 'Not Weird'
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number here:");
        int n = scanner.nextInt();
        scanner.close();
        String ans = "";

        //Setting the constraints
        if(n >= 1 && n <= 100) {
            //if 'n' is NOT evenly divisible by 2 -> n is odd or n is even but between 6 and 20 then they are 'weird'
            if (n % 2 == 1 || n % 2 == 0 && n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
