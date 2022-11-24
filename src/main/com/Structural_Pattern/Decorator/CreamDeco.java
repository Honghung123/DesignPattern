package main.com.Structural_Pattern.Decorator;

public class CreamDeco extends PizzaDecorator{
    CreamDeco(IPizza ipizza) {
        super(ipizza);
    }

    public String addCream() {
        return " + Cream";
    }

    public String doPizza() {
        return super.doPizza()+ addCream();
    }
}
