package LF8.Aufgaben_Tag1;
import LF8.IAufgabe;

public class Arithmetische_Operatoren implements IAufgabe {
    public void Start() {
        float a = 5f;
        float b = 10f;
        float c, d, e, f;
    
        c = a + b;  //Addition
        d = a - b;  //Substraktion
        e = a * b;  //Multiplikation
        f = a / b;  //Division
    
        float g = 25f;
        float h = 12f;
        float i, j;
    
        i = g % h;
        j = h % g;
    
        System.out.println("Addition: " + c);
        System.out.println("Substraktion: " + d);
        System.out.println("Multiplikation: " + e);
        System.out.println("Division: " + f);
    
        System.out.print("Modulo i: " + i + "\n");
        System.out.print("Modulo j: " + j + "\n");
    }
}
