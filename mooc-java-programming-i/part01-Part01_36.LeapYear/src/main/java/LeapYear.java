
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        int remainderFour = year % 4;
        int remainderHundo = year % 100;
        int remainderFourhundo = year % 400;
        
        if (remainderFour != 0) {
            System.out.println("The year is not a leap year.");
        } else if (remainderHundo == 0 && remainderFourhundo != 0) {
            System.out.println("The year is not a leap year");
        } else {
            System.out.println("The year is a leap year.");
        }
                
    }
}
