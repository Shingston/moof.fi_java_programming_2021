
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());       
        
        int sumNum = firstNum + secondNum;
        int diffNum = firstNum - secondNum;
        int prodNum = firstNum * secondNum;
        double divNum = (double)firstNum / secondNum;
                  
        System.out.println(firstNum + " + " + secondNum + " = " + sumNum);
        System.out.println(firstNum + " - " + secondNum + " = " + diffNum);
        System.out.println(firstNum + " * " + secondNum + " = " + prodNum);
        System.out.println(firstNum + " / " + secondNum + " = " + divNum);
    }
}
