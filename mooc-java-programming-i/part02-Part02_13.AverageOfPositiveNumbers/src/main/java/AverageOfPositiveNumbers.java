
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumOfNum = 0;
        int numOfNum = 0;
        double avgOfNum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            if (num > 0) {
                sumOfNum = sumOfNum + num;
                numOfNum++;
                avgOfNum = sumOfNum / numOfNum;
                continue;
            }

        }

        if (numOfNum > 0) {
            System.out.println(avgOfNum);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
