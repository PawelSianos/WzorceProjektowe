package Wzorce.projektowe.decorator;

public class ShrimpMealDecorator extends MealDecorator{
    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        super.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("Dodaję krewetki");
    }
}
