package LF8.Aufgaben_Tag2;
import LF8.Interfaces.IAufgabe;

public class Bedingter_Operator implements IAufgabe{
    int a;
    int b;
    int max;

    public void Start() {
        a = 3;
        b = 5;
        max = (a > b) ? a : b;
        System.out.println("Der größte Wert ist: " + max);
    }
    
}
