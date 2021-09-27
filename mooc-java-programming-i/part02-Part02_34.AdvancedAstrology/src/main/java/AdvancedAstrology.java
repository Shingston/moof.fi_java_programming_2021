
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise

        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise

        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        int spaceNum = size - 1;
        int starNum = 1;

        for (int a = 0; a < size; a++) {

            printSpaces(spaceNum);
            spaceNum--;

            printStars(starNum);
            starNum++;

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        int spaceNum = height - 1;
        int starNum = 1;

        for (int a = 0; a < height; a++) {

            printSpaces(spaceNum);
            spaceNum--;

            printStars(starNum);
            starNum += 2;

        }
        for (int b = 0; b < 2; b++) {
            
            printSpaces(height - 2);

            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
