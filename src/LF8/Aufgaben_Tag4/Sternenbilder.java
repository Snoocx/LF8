package LF8.Aufgaben_Tag4;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;

public class Sternenbilder implements IAufgabe{
    private Scanner input;

    public void start() {
        input = new Scanner(System.in); 
        System.out.println("-- Sternbilder --"); 
        System.out.println("bitte Ganzzahl eingeben: "); 
        int zahl = input.nextInt(); 
        aufgabe4(zahl);
    }

    private void aufgabe1(int zahl){
        for(int i = 1; i <= zahl; i++){
            for(int x = 1; x <= zahl; x++){
                System.out.print("* ");  
           }
           System.out.println();
        }
    }
    
    private void aufgabe2(int zahl){
        for(int i = 1; i <= zahl; i++){
            for(int x = 1; x <= zahl; x++){
                if((i > 1 && i < zahl) && (x == 1 || x == zahl))
                    System.out.print("* ");  
                else if(i == 1 || i == zahl)
                    System.out.print("* ");
                else
                    System.out.print("  ");  
           }
           System.out.println();
        }
    }

    private void aufgabe3(int zahl){
        int tempZahl = zahl;

        for(int i = 1; i <= zahl; i++){
            for(int x = tempZahl; x != 0; x--){
                System.out.print("* ");  
           }
           tempZahl = tempZahl - 1;
           System.out.println();
        }
    }

    private void aufgabe4(int zahl){
        boolean alreadyDotted = false;
        int xZahl = zahl;

        for(int i = 1; i <= zahl; i++){
                if(i >= 2 && !alreadyDotted){
                    for(int d = 1; d <= i - 1; d++){
                        System.out.print(". ");
                }
                alreadyDotted = true;
                }

                if(alreadyDotted || i == 1){
                for(int x = 1; x <= xZahl; x++){
                    System.out.print("* ");  
                }
           }
           xZahl--;
           System.out.println();
           alreadyDotted = false;
        }
    }
}
