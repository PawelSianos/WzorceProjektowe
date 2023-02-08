package Wzorce.projektowe.decorator;

public class SauceMealDecorator extends MealDecorator{
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addSauce();
    }

    private void addSauce() {
        System.out.println("Dodaję sos");
    }
}