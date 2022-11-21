package main.com.Creational_Pattern.Abstract_Factory_Pattern.implementss;
import main.com.Creational_Pattern.Abstract_Factory_Pattern.Animal; 


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
