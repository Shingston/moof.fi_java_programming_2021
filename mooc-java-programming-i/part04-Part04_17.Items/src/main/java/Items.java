
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int nbNames = 0;

        while (true) {
            
            System.out.print("Name: ");
            
            Item item = new Item(scanner.nextLine());
            
            if(item.getName().equals("")){
                break;
            }
            
            items.add(item);
           
        }
        
        for(Item i : items){
            System.out.println(i);
        }
        
        

    }
}
