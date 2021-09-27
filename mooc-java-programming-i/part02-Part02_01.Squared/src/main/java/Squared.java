
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double number = Integer.valueOf(scanner.nextLine());
        double square = Math.pow(number, 2);
        System.out.println(square);

    }
}
