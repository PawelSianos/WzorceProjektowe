package Wzorce.projektowe.chain.of.responsybility;

public class Main {

    public static void main(String[] args) {

        MotherRequest motherRequest = new MotherRequest(Shelf.MEDIUM);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);
        tomek.processRequest(motherRequest);
    }
}
