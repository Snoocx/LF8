public class Wahrheitswerte implements IAufgabe {
    public void Start() {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        // Exklusive Oder auf a und b anwenden
        // Exklusive oder auf a und c anwenden
        // Und auf a und b anwenden
        // Und auf a und c anwenden
        // Oder auf a und b anwenden
        // Oder auf a und c anwenden
        
        System.out.println("Exklusive Oder(^) auf a und b anwenden: " + (a ^ b));
        System.out.println("Exklusive Oder(^) auf a und c anwenden: " + (a ^ c));

        System.out.println("Und(&&) auf a und b anwenden: " + (a && b));
        System.out.println("Und(&&) auf a und c anwenden: " + (a && c));

        System.out.println("Bitweises Und(&) auf a und b anwenden: " + (a & b));
        System.out.println("Bitweises Und(&) auf a und c anwenden: " + (a & c));

        System.out.println("Oder(||) auf a und b anwenden: " + (a || b));
        System.out.println("Oder(||) auf a und c anwenden: " + (a || c));
    }
}
