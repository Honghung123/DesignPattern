package main.com.Structural_Pattern.Decorator;

public class MeatFood implements Food {

    @Override
    public String prepareFood() {
        return "All Meat Food will be served === >";
    }

    @Override
    public double foodPrice() {
        return 15;
    }
    
}
