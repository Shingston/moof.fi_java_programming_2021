
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String stringCheck = "true";
        
        System.out.print("Give a string:");
        String stringToCheck = scanner.nextLine();
        
        if (stringToCheck.equals(stringCheck)){
            System.out.println("You got it right!");
        }else{
            System.out.println("Try again!");
        }
               
        

    }
}
