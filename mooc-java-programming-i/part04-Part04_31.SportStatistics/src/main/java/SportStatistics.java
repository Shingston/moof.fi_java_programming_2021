
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        ArrayList<String> scores = new ArrayList<>();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                scores.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        for (String score : scores) {
            String[] scoreParts = score.split(",");
            if (score.contains(team)) {
                gamesPlayed++;
                if (scoreParts[0].equals(team) && Integer.valueOf(scoreParts[2]) > Integer.valueOf(scoreParts[3])
                        || scoreParts[1].equals(team) && Integer.valueOf(scoreParts[3]) > Integer.valueOf(scoreParts[2])
                ) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
