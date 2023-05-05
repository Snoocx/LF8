package LF8.Aufgaben_Tag2;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;

public class Switch implements IAufgabe {
    private Scanner input;

    public void start() {
        input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        CheckZahl(GetZahl());    
        input.close();
    }

    private int GetZahl(){
        return input.nextInt();
    }

    private void CheckZahl(int zahl){
        switch(zahl){
            case 1:
                System.out.println("Es wurde eins eingegeben");
                break;
            case 2:
                System.out.println("Es wurde zwei eingegeben");
                break;
            case 3:
                System.out.println("Es wurde drei eingegeben");
                break;
            default:
                System.out.println("Es wurde weder 1, 2 noch 3 eingegeben");
                break;
        }
    }
}
