package Wzorce.projektowe.chain.of.responsybility;

public class Antek extends Child{

    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Tomek zdjoł słoik z półki!");
        } else {
            System.out.println("Dzieci są za niskie");
        }
    }
}
