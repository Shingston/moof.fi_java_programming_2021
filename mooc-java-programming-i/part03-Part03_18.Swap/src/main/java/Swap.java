
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them
        
        System.out.println("Give two indices to swap:");
        
        int firstIndice = Integer.valueOf(scanner.nextLine());
        int secondIndice = Integer.valueOf(scanner.nextLine());
        
        int firstSwap = array[firstIndice];
        int secondSwap = array[secondIndice];
        
        array[firstIndice] = secondSwap;
        array[secondIndice] = firstSwap;


        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
