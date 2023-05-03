package LF8.Aufgaben_Tag2;
import LF8.Interfaces.IAufgabe;

public class Zahlenpyramide implements IAufgabe {
    public void Start() {
        int i = 0;
        String ausgabe = "";

        while(i < 10){
            ausgabe = ausgabe + " " + i;
            System.out.println(ausgabe);
            i++;
        }
    }
    
}
