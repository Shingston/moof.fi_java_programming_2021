
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numInput = Integer.valueOf(scanner.nextLine());
        int numHundred = 100;
        
        while (numInput <= numHundred) {
            System.out.println(numInput);
            numInput++;
        }

    }
}
