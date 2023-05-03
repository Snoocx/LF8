package LF8.Aufgaben_Tag2;
import LF8.Interfaces.IAufgabe;

public class Even implements IAufgabe {
    public void Start() {
        for(int i = 0; i <= 50; i++){
            if(i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
