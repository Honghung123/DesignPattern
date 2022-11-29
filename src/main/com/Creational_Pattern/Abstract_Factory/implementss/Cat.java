package main.com.Creational_Pattern.Abstract_Factory.implementss;
import main.com.Creational_Pattern.Abstract_Factory.Animal; 


public class Cat implements Animal{
    @Override
    public String getName() {
        return "Pretty Cat";
    }

    @Override
    public String getSound() {
        return "Meow Meow";
    }
}
