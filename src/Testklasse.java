public class Testklasse {
    private String ausgabe = "Testausgabe";

        public Testklasse(int i){
            Testmethode();
        }

        public Testklasse(){
            Testmethode();
        }

        public void Testmethode(){
            System.out.println("Ich bin eine " + ausgabe);
        }
}