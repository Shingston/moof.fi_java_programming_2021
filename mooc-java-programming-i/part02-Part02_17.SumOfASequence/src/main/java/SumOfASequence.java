
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");

        int n = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int sum = 1;

        while (i < n) {

            sum = sum + i + 1;
            i++;

        }
        
        System.out.println(sum);

    }
}
