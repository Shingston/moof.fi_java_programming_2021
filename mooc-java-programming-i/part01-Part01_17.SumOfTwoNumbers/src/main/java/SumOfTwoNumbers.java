
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give the first number:");
        int one = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int two = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (one + two));

    }
}
