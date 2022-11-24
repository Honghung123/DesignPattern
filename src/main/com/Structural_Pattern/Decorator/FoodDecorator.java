package main.com.Structural_Pattern.Decorator;

public abstract class FoodDecorator implements Food{
    private Food newFood;

    public FoodDecorator(Food newFood) {
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double foodPrice() {
        return newFood.foodPrice();
    }
 
}
