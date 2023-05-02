package LF8.Extras;
import java.util.*;
import LF8.Interfaces.IAufgabe;

public class Benutzereingabe implements IAufgabe {
    public void Start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie bitte Ihren namen ein: ");
        String name = input.nextLine();
        System.out.println("Dein Name ist: " + name);
        input.close();
    }
}
