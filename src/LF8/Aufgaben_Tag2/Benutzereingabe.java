package LF8.Aufgaben_Tag2;
import java.util.*;
import LF8.Interfaces.IAufgabe;

public class Benutzereingabe implements IAufgabe {
    private Scanner input;

    public void start() {
        input = new Scanner(System.in);
        System.out.println("Sie heißen: " + GetName());
        System.out.println("Sie sind " + GetAlter() + " Jahre alt.");
        System.out.println("Sie sind " + GetGroeße() + "cm");        
        input.close();
    }

    private String GetName(){
        System.out.print("Geben Sie Ihren Namen ein: ");
        return input.nextLine();
    }

    private int GetAlter(){
        System.out.print("Geben Sie Ihr Alter ein: ");
        return input.nextInt();
    }

    private double GetGroeße(){
        System.out.print("Geben Sie ihre Körpergröße in cm ein: ");
        return input.nextDouble();
    }
}
