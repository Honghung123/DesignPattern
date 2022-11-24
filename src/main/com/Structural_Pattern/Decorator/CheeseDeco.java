package main.com.Structural_Pattern.Decorator;

public class CheeseDeco extends PizzaDecorator{
    CheeseDeco(IPizza ipizza) {
        super(ipizza);
    }

    public String addCheese() {
        return " + Cheese";
    }

    public String doPizza() {
        return super.doPizza()+ addCheese();
    }
}
