package main.com.Structural_Pattern.Decorator;

public class PapperDeco extends PizzaDecorator {
    
    PapperDeco(IPizza ipPizza) {
        super(ipPizza);
    }

    public String addPapper(){
        return " + Papper";
    }

    public String doPizza() {
        return super.doPizza() + addPapper();
    }

}
