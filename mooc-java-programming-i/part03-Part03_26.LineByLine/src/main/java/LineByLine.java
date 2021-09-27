
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String line = scanner.nextLine();

            if (!(line.equals(""))) {
                String[] splitLine = line.split(" ");

                int index = 0;
                while (index < splitLine.length) {
                    System.out.println(splitLine[index]);
                    index++;
                }
            } else {
                break;
            }

        }
    }
}
