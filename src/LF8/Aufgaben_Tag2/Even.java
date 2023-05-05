package LF8.Aufgaben_Tag2;
import LF8.Interfaces.IAufgabe;

public class Even implements IAufgabe {
    /* Es sollen alle gerade Zahlen von 0 bis 50 in einer Zeile ausgegeben werden,
     * jeweils durch ein Leerzeichen getrennt (mit einer While- oder For-Schleife)
     */
    public void start() {
        int i = 0;
        while(i <= 50){
                System.out.print((i % 2 == 0) ? i : " ");
            i++;
        }
    }
}
