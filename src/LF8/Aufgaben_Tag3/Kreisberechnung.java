package LF8.Aufgaben_Tag3;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;

public class Kreisberechnung implements IAufgabe{

    final float pi = 3.1415f;
    private Scanner input;

    public void Start() {
        input = new Scanner(System.in);

        // Kreisumfang berechnen. Radius = 10cm
        System.out.println(CalculateUmfang(10));
        // Kreisflächeninhalt bei einem Radius von 10cm
        System.out.println(CalculateFlaecheninhalt(10));

        System.out.println("Geben Sie den Radius in CM ein um den Kreisumfang zu berechnen:");
        System.out.println("Der Umfang beträgt: " + CalculateUmfang(input.nextFloat()) + "cm");

        System.out.println("Geben Sie den Radius in CM ein um den Kreisflächeninhalt zu berechnen:");
        System.out.println("Der Flächeninhalt beträgt: " + CalculateFlaecheninhalt(input.nextFloat()) + "cm");

        input.close();
    }
    
    private float CalculateUmfang(float r){
        return 2*r*pi;
    }

    private float CalculateFlaecheninhalt(float r){
        return pi*(r*r);
    }

}
