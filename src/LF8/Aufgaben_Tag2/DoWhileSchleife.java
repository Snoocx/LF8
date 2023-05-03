package LF8.Aufgaben_Tag2;

import java.util.Scanner;

import LF8.Interfaces.IAufgabe;

public class DoWhileSchleife implements IAufgabe {
    private Scanner input;

    public void Start() {
        input = new Scanner(System.in);
        Schleife();
        input.close();
    }

    private void Schleife() {
        String text = "";
        do {
            System.out.println("Bitte geben Sie einen Text ein: ");
            text = input.nextLine();
            if(text.length() == 0 || text == "q")
                break;
            System.out.println("\nEingegebener Text: " + text);
            System.out.println("text.length(): " + text.length() + "\n");
        }while(true);    
    }
    
}
