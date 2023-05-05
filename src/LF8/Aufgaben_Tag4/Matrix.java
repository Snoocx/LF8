package LF8.Aufgaben_Tag4;
import LF8.Interfaces.IAufgabe;

public class Matrix implements IAufgabe{
    public void start() {
        System.out.println(""); 
        System.out.println("Matrix"); 
        for (int zeile =0; zeile < 10; zeile++) { 
            for (int spalte=0; spalte < 10; spalte++) {
                int zahl = Integer.parseInt(zeile + "" + spalte); 
                if(spalte == 4 || zeile == 4 || zahl % 4 == 0)
                    System.out.print(" **");
                else
                    System.out.print(" " + zeile + spalte); 
            } 
            System.out.println(); 
        } 
    }
    
}
