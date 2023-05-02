import java.util.*;

public class Benutzereingabe {
    public Benutzereingabe(){
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren namen ein: ");
        String name = input.nextLine();
        System.out.println("Dein Name ist: " + name);
    }
}
