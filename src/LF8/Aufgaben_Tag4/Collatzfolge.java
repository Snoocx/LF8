package LF8.Aufgaben_Tag4;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;

public class Collatzfolge implements IAufgabe{
    private Scanner input;

    public void start() {
        input = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int startZahl = input.nextInt();
        runCollatz(startZahl);
        input.close();
    }

    private void runCollatz(int startZahl){
        int stellenNachStartZahl = 0;
        int collatzZahl = startZahl;

        while(stellenNachStartZahl < 15){
            collatzZahl = calculateCollatz(collatzZahl); // Rechenlogik von der Programmlogik trennen

            if(collatzZahl <= startZahl && collatzZahl <= 4)
                stellenNachStartZahl++;

            System.out.print(collatzZahl + " ");
        }
    }

    private int calculateCollatz(int collatzZahl){
        if(collatzZahl % 2 != 0)
            return (collatzZahl * 3) + 1;
        else
            return collatzZahl / 2;
    }
}
