package LF8.Aufgaben_Tag2;

import LF8.Interfaces.IAufgabe;

public class ForSchleife implements IAufgabe{
    public void start() {
        for(int i = 0; i < 10; i++){
            if(i == 3)
                continue;
            System.out.println(i + ": * ");
        }
    }   
}
