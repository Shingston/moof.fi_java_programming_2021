
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxNum = Integer.valueOf(scanner.nextLine());
        int num = 0;
        
        while (num <= maxNum){
            System.out.println(num);
            num ++;
        }

    }
}
