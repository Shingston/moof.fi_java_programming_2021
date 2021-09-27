import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true){
            
            System.out.print("Title: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            Book newBook = new Book(name, pages, publicationYear);
            
            books.add(newBook);
            
        }
        
        System.out.print("What information will be printed?");
        String input = scanner.nextLine();
        
        if(input.equals("everything")){
            for (Book b : books){
                System.out.println(b);
            }
        } else if (input.equals("name")){
            for (Book b : books){
                System.out.println(b.getName());
            }
        }
        
    }
}
