package LF8.Aufgaben_Tag2;

import LF8.Interfaces.IAufgabe;

public class WhileSchleife implements IAufgabe{
    public void Start() {
        int k = 0;
        while(k <= 10){
            System.out.println(k);
            k = k + 1;
        }
    }
    
}
