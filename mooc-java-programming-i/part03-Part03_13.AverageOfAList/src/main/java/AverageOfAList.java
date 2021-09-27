
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        
        int sum = 0;
        double avg = 0;

        for(int number : list){
            sum = sum + number;
        }
        
        double sumDoub = sum;
        avg = sumDoub / list.size();
        
        System.out.println("Average: " + avg);
    }
}
