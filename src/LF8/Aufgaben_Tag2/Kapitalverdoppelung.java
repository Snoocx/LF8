package LF8.Aufgaben_Tag2;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;
import javax.swing.JOptionPane;

public class Kapitalverdoppelung implements IAufgabe{
    private Scanner input;
    
    public void Start() {
        double startKapital;
        double zinsSatz;
        int jahr = 0;
        double kapital;
        
        input = new Scanner(System.in);
        String eingabeSK = JOptionPane.showInputDialog("Startkapital: ");
        startKapital = Integer.parseInt(eingabeSK);

        String eingabeZS = JOptionPane.showInputDialog("Zinssatz: ");
        zinsSatz = Integer.parseInt(eingabeZS);
        kapital = startKapital;

        do{
            kapital = kapital * (1 + zinsSatz / 100);
            jahr = jahr + 1;
        }while(kapital < 2 * startKapital);

        JOptionPane.showMessageDialog(null, "Kapital: " + kapital + "\nKapitalverdoppelung nach " + jahr + " Jahren.");
        input.close();
    }
}
