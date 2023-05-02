public class Datentypen {
    
    /// Constructor
    public Datentypen(){
        char x = 'x';
        char y[] = {'x', 'y', 'z'};
        String yString = "xyz";
        float f = 1.25f;
        double d = 32;

        System.out.println(x);
        
        for (char c : y) {
            System.out.println(c);            
        }

        System.out.println(yString);
        System.out.println(f);
        System.out.println(d);
    }
    
}
