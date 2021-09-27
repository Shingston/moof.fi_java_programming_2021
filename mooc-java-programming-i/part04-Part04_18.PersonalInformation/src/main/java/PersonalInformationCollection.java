
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("First name:");
            String firstName = scanner.nextLine();

            if (firstName.equals("")) {
                break;
            }

            System.out.println("Last Name");
            String lastName = scanner.nextLine();

            System.out.println("Identification number:");
            String identNumber = scanner.nextLine();
            
            PersonalInformation newPerson = new PersonalInformation(firstName, lastName, identNumber);
            
            infoCollection.add(newPerson);

        }
        
        for (PersonalInformation pI : infoCollection){
            System.out.println(pI.getFirstName() + " " + pI.getLastName());
        }

    }
}
