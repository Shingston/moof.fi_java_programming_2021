
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(1, 12);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {

        int num = beginning;

        while (num <= end) {

            if (num % 3 == 0) {
                System.out.println(num);
                num++;
            } else {
                num++;
            }

        }

    }

}
