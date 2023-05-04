package LF8.Aufgaben_Tag3;
import java.util.Scanner;
import LF8.Interfaces.IAufgabe;

public class Zufallszahlen implements IAufgabe {
    private Scanner input;

    public void Start() {
        input = new Scanner(System.in);
        Generate();
        CustomGenerate();
    }

    private void CustomGenerate(){
        System.out.println("Wie viele Zahlen sollen generiert werden?");
        int totalNumbers = input.nextInt();

        System.out.println("Zufallszahl von ");
        int rangeFrom = input.nextInt();

        System.out.println("Bis ");
        int rangeTo = input.nextInt();

        for (int number : GenerateRandomNumbers(rangeFrom, rangeTo, totalNumbers)) {
            System.out.println(number);
        } ;
    }
 
    private void Generate(){
        // 10 Zufallszahlen von 0 bis 1000
        for (int number : GenerateRandomNumbers(0, 1000, 10)) {
            System.out.println(number);
        } ;

        // 15 Zufallszahlen von 0 bis 1
        for (int number : GenerateRandomNumbers(0, 1, 15)) {
            System.out.println(number);
        } ;
    }

    private int[] GenerateRandomNumbers(int rangeFrom, int rangeTo, int totalNumbers){
        int[] intArray = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            intArray[i] = rangeFrom + (int)(Math.random() * ((rangeTo - rangeFrom) + 1));
        }

        return intArray;
    }
    
}
