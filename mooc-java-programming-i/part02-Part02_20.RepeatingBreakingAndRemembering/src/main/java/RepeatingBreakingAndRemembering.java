
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int sumNum = 0;
        int sumNumEven = 0;
        int sumNumOdd = 0;
        double avg = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input != -1) {
                sum = sum + input;
                sumNum++;
                if (input % 2 == 0) {
                    sumNumEven++;
                } else {
                    sumNumOdd++;
                }

            } else {
                double sumNumDoub = sumNum;
                avg = sum / sumNumDoub;
                System.out.println("Thx! Bye!");
                break;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + sumNum);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + sumNumEven);
        System.out.println("Odd: " + sumNumOdd);

    }
}
