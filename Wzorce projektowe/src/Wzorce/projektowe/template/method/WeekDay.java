package Wzorce.projektowe.template.method;

public abstract class WeekDay {
    public final void everyDayIsExaclyTheSame(TypeOfTransport typeOfTransport){
        wakeUp();
        getReady();
        int time = gotToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    protected abstract void getReady();

    protected abstract void work();

    protected abstract int gotToWork(TypeOfTransport typeOfTransport);

    protected void summary(int time){
        System.out.println("Droga do pracy zajęła " + time + " minut" );
    }

    private void wakeUp() {
        System.out.println("Pobudka");
    }

    private void goHome() {
        System.out.println("Powrót do domu");
    }
}
