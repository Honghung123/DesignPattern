package main.com.Creational_Pattern.Abstract_Factory_Pattern;

import main.com.Creational_Pattern.Abstract_Factory_Pattern.implementss.Cat;
import main.com.Creational_Pattern.Abstract_Factory_Pattern.implementss.Red;

public class Main {
    public static void main(String[] args) { 
        System.out.println(FactoryProvider.getFactory(EntityType.ANIMAL) instanceof AnimalFactory);
        AnimalFactory factory = (AnimalFactory) FactoryProvider.getFactory(EntityType.ANIMAL);
        Cat cat = (Cat) factory.create("Cat");
        System.out.println(cat.getName()+"   "+ cat.getSound());
        System.out.println(FactoryProvider.getFactory(EntityType.ANIMAL).create("Cat") 
         instanceof Cat);
        System.out.println(FactoryProvider.getFactory(EntityType.COLOR) instanceof ColorFactory);
    }
}
