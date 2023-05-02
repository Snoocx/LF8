import java.util.*;

public class Benutzereingabe implements IAufgabe {
    public void Start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren namen ein: ");
        String name = input.nextLine();
        System.out.println("Dein Name ist: " + name);
    }
}
