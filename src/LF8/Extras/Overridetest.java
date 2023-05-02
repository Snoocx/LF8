package LF8.Extras;
public class Overridetest extends Testklasse {
    public Overridetest() {
        //super(0);
        //Testmethode();
    }

    @Override
    public void Testmethode(){
        System.out.println("Ich bin eine Testausgabe. Jedoch wurde ich überschrieben.");
    }


}
