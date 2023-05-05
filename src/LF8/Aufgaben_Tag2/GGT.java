package LF8.Aufgaben_Tag2;
import java.util.*;
import LF8.Interfaces.IAufgabe;
import javax.swing.JOptionPane;

public class GGT implements IAufgabe{
    private Scanner input;

    public void start() {
        int m, n, r;

        input = new Scanner(System.in);
        String eingabeM = JOptionPane.showInputDialog("Erste Zahl eingeben: ");
        m = Integer.parseInt(eingabeM);
        String eingabeN = JOptionPane.showInputDialog("Zweite Zahl eingeben: ");
        n = Integer.parseInt(eingabeN);
        r = m % n;

        while (r > 0){
            m = n;
            n = r;
            r = m % n;
        } 

        JOptionPane.showMessageDialog(null, n + " ist der Größte Gemeinsame Nenner");
        input.close();
    }
    
}
