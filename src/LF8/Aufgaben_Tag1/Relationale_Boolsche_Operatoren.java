package LF8.Aufgaben_Tag1;
import LF8.IAufgabe;

public class Relationale_Boolsche_Operatoren implements IAufgabe {
    public void Start() {
        int x = 10;
        double y = 10.5;
        float f = 12f;
        boolean z = false;

        //Relationale Operatoren( <> )
        System.out.println("Die Antwort zu x > 0 lautet: " + (x > 0));
        System.out.println("Die Antwort zu x < y lautet: " + (x < y)); 

        //Relationale( <> ) & Boolsche Operatoren ( ! )
        System.out.println("Das Ergebnis von !(x > y) ist: " + !(x > y)); // true, weil die Bedinung nicht wahr ist, aber negiert wurde
        System.out.println("Das Ergebnis von !(x > y) ist: " + !(x < y)); // false, weil die Bedinung wahr ist, aber negiert wurde

        // Und Operator( && )
        System.out.println("Die Antwort: " + ((x > 0) && (y < 20))); // true, weil beide Bedinungen wahr sind
        System.out.println("Die Antwort: " + ((x > 0) && (y > 20))); // false, weil eine Bedinungen nicht wahr ist

        // Oder Operator( || )
        System.out.println("Die Antwort: " + ((x > 0) || (y < 20))); // true, weil mindestens eine Bedinungen wahr ist
        System.out.println("Die Antwort: " + ((x > 0) || (y > 20))); // true, weil mindestens eine Bedinungen wahr ist

        // XOR Operator( ^ )
        System.out.println("Die Antwort: " + ((x > 0) ^ (y < 20))); // false, weil beide Bedinungen wahr sind
        System.out.println("Die Antwort: " + ((x > 0) ^ (y > 20))); // true, weil nur eine Bedinungen wahr ist;
    }
}
