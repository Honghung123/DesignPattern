package main.com.Structural_Pattern.Decorator;

public class VegFood implements Food {
    @Override
    public String prepareFood() {
        return "This is Veg Food +++>>>";
    }

    @Override
    public double foodPrice() {
        return 50.0;
    }
}
