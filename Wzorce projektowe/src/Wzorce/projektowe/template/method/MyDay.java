package Wzorce.projektowe.template.method;

public class MyDay extends WeekDay {
    @Override
    protected void getReady() {
        System.out.println("Przygotowanie do pracy");
    }

    @Override
    protected void work() {
        System.out.println("kodowanie i kawa");
    }

    @Override
    protected int gotToWork(TypeOfTransport typeOfTransport) {
        switch(typeOfTransport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }


}
