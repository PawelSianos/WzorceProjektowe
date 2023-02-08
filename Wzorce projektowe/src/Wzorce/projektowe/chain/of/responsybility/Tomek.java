package Wzorce.projektowe.chain.of.responsybility;

public class Tomek extends Child{

    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjoł słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
