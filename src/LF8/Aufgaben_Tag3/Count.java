package LF8.Aufgaben_Tag3;
import LF8.Interfaces.IAufgabe;

public class Count implements IAufgabe {
    public void Start() {
        int count = 0;

        for (int k = 1; k <= 10; k++){
            count++;
        }
        
        System.out.println(count);
    }
}