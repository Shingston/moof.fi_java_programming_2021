
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String line = scanner.nextLine();

            if (!(line.equals(""))) {
                String[] splitLine = line.split(" ");

                int index = 0;
                while (index < splitLine.length) {
                    if (splitLine[index].contains("av")) {
                        System.out.println(splitLine[index]);
                        index++;
                    } else {
                        index++;
                    }
                }
            } else {
                break;
            }

        }

    }
}
