
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
    
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // write code here
        
        paulsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.eatAffordably();
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.addMoney(20);
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.eatHeartily();
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.eatHeartily();
        System.out.println("Paul: " + paulsCard);
        
        mattsCard.addMoney(50);
        System.out.println("Matt: " + mattsCard);
        
    }
}

