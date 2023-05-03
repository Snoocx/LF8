package LF8.Aufgaben_Tag2;
import java.util.*;
import LF8.Interfaces.IAufgabe;

public class Benutzereingabe implements IAufgabe {
    private Scanner input;

    public void Start() {
        input = new Scanner(System.in);
        GetName();
        GetAlter();
        input.close();
    }

    private void GetName(){
        System.out.print("Geben Sie Ihren Namen ein: ");
        String name = input.nextLine();
        System.out.println("Ihr Name ist: " + name);
    }

    private void GetAlter(){
        System.out.print("Geben Sie Ihr Alter ein: ");
        int alter = input.nextInt();
        System.out.println("Sie sind " + alter + " Jahre alt.");
    }
}
