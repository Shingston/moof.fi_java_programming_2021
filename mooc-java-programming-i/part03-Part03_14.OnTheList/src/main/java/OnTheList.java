
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        String nameSearch = scanner.nextLine();

        for (String name : list) {
            if (list.contains(nameSearch)) {
                System.out.println(nameSearch + " was found!");
                break;
            } else {
                System.out.println(nameSearch + " was not found!");
            }
        }
        
        

    }
}
