
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbOfInputs = 0;
        double sumBirthYear = 0;
        int longestNameLength = 0;
        String longestName = "";

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitInput = input.split(",");

            if (splitInput[0].length() > longestNameLength) {
                longestName = splitInput[0];
                longestNameLength = splitInput[0].length();
            }

            sumBirthYear = sumBirthYear + Integer.valueOf(splitInput[1]);
            nbOfInputs++;

        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sumBirthYear / nbOfInputs));

    }
}
