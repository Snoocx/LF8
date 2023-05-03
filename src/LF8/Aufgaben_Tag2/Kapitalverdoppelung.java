package LF8.Aufgaben_Tag2;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;

public class Kapitalverdoppelung implements IAufgabe{
    private Scanner input;
    
    public void Start() {
        double startKapital;
        double zinsSatz;
        int jahr = 0;
        double kapital;
        
        input = new Scanner(System.in);
        System.out.println("Startkapital: ");
        startKapital = input.nextDouble();
        System.out.println("Zinssatz: ");
        zinsSatz = input.nextDouble();
        kapital = startKapital;

        do{
            kapital = kapital * (1 + zinsSatz / 100);
            jahr = jahr + 1;

        }while(kapital < 2 * startKapital);

        System.out.println("Kapital: " + kapital);
        System.out.println("Kapitalverdoppelung nach " + jahr + " Jahren.");
        input.close();
    }
    

}
