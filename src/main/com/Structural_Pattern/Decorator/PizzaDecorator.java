package main.com.Structural_Pattern.Decorator;

public abstract class PizzaDecorator implements IPizza{
    protected IPizza ipizza;

    PizzaDecorator(IPizza ipizza) { 
        this.ipizza = ipizza;
    }

    @Override
    public String doPizza() {
        return ipizza.doPizza();
    }
}
