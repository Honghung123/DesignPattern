package main.com.Structural_Pattern.Facade;

public class Xiaomi implements MobileShop {
    @Override
    public void modelName() {
        System.out.println(" Xiaomi MIMAX 4 ");
    }

    @Override
    public void price() {
        System.out.println(" 55000$ ");
    }
}
