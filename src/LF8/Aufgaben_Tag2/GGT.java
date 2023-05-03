package LF8.Aufgaben_Tag2;
import java.util.*;
import LF8.Interfaces.IAufgabe;

public class GGT implements IAufgabe{
    private Scanner input;

    public void Start() {
        int m, n, r;

        input = new Scanner(System.in);
        System.out.print("Erste Zahl eingeben: ");
        m = input.nextInt();
        System.out.print("Zweite Zahl eingeben: ");
        n = input.nextInt();
        r = m % n;

        while (r > 0){
            m = n;
            n = r;
            r = m % n;
        } 

        System.out.println(n);
        input.close();
    }
    
}
