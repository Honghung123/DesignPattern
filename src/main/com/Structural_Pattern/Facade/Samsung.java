package main.com.Structural_Pattern.Facade;

public class Samsung implements MobileShop {
    @Override
    public void modelName() {
        System.out.println(" Samsung galaxy S10 ");
    }

    @Override
    public void price() {
        System.out.println(" 45000$ ");
    }
}
