package LF8.Aufgaben_Tag2;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;

public class Benutzereingabe_Verzweigung implements IAufgabe {
    private Scanner input;

    public void Start() {
        input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        double zahl = Zahl();
        CheckZahl(zahl);    
        input.close();
    }
    
    private double Zahl(){
        return input.nextDouble();
    }

    private void CheckZahl(double zahl){
        if(zahl >= 10 && zahl <= 20){
            System.out.println("Die Zahl " + zahl + " liegt im Bereich von 10 bis 20");    
        } else if(zahl < 10){
            System.out.println("Die Zahl " + zahl + " ist kleiner als 10");    
        } else {
            System.out.println("Die Zahl " + zahl + " liegt nicht im Bereich");
        }
    }
}
