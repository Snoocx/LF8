package LF8.Aufgaben_Tag2;
import LF8.Interfaces.IAufgabe;

public class Even implements IAufgabe {
    public void Start() {
        int i = 0;
        while(i <= 50){
            if(i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}
