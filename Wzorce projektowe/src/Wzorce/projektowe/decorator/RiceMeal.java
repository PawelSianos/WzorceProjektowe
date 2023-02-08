package Wzorce.projektowe.decorator;

public class RiceMeal extends Meal{
    @Override
    public void prepareMeal() {
        System.out.println("Przygotowuję danie na bazie ryżu");
    }
}
