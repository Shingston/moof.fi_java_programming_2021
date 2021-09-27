
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Where to?");
        int maxNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        
                
        int num = Integer.valueOf(scanner.nextLine());
        
        while (num <= maxNum) {
            System.out.println(num);
            num++;
        }
    }
}
