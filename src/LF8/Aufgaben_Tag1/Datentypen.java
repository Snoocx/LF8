package LF8.Aufgaben_Tag1;
import LF8.Interfaces.IAufgabe;

public class Datentypen implements IAufgabe {

    public void Start() {
        char x = 'x';
        char y[] = {'x', 'y', 'z'};
        String yString = "xyz";
        float f = 1.25f;
        double d = 32;

        System.out.println("x: " + x);
        System.out.print("y[]: ");
        for (char c : y) { // char array (y) als String ausgeben
            System.out.print(c);            
        }
        System.out.print("\n");
        System.out.println("yString: " + yString);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
    }
    
}
