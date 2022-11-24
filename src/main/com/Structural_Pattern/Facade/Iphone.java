package main.com.Structural_Pattern.Facade;

public class Iphone implements MobileShop {
    @Override
    public void modelName() {
        System.out.println(" Iphone 14 PRO MAX ");
    }

    @Override
    public void price() {
        System.out.println(" 65000$ ");
    }
}
