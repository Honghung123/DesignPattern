package main.com.Creational_Pattern.Abstract_Factory_Pattern.implementss;
import main.com.Creational_Pattern.Abstract_Factory_Pattern.Color;


public class Red implements Color{
    @Override
    public String getName() {
        return "Red Color";
    }
    
    @Override
    public String getValue() {
        return "Color is beatiful";
    }
}
