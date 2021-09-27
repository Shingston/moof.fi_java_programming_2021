
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int facto = 1;
        
        if (num > 0){
            for (int i = 1; i <= (num); i++){
                facto = facto * i;    
            }
            System.out.println("Factorial:" + facto);
        } else {
            facto = 1;
            System.out.println("Factorial" + facto);
        }

    }
}
