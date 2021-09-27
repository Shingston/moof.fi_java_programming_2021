
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int i = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());             
        
        int sum = i;

        while (i < n) {

            sum = sum + i + 1;
            i++;

        }
        
        System.out.println(sum);

    }
}
