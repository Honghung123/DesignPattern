package main.com.Creational_Pattern.Abstract_Factory;

import main.com.Creational_Pattern.Abstract_Factory.implementss.Cat;
import main.com.Creational_Pattern.Abstract_Factory.implementss.Red;

public class Main {
    public static void main(String[] args) { 
        System.out.println(FactoryProvider.getFactory(EntityType.ANIMAL) instanceof AnimalFactory);
        AnimalFactory factory = (AnimalFactory) FactoryProvider.getFactory(EntityType.ANIMAL);
        Cat cat = (Cat) factory.create("Cat");
        System.out.println(cat.getName()+"   "+ cat.getSound());
        System.out.println(FactoryProvider.getFactory(EntityType.ANIMAL).create("Cat") 
        instanceof Cat);
        ColorFactory colorFactory = (ColorFactory) FactoryProvider.getFactory(EntityType.COLOR);
        Color color =  colorFactory.create("Red");
        System.out.println(FactoryProvider.getFactory(EntityType.COLOR) instanceof ColorFactory);
        if(color != null)
            System.out.println(color.getName() + " - "+ color.getValue());
        ToyFactory toyFactory = (ToyFactory) FactoryProvider.getFactory(EntityType.TOY);
        Toy toy =  toyFactory.create("Plane");
        System.out.println(FactoryProvider.getFactory(EntityType.TOY) instanceof ToyFactory);
        if (toy != null) {
            toy.getName();
            System.out.println( " - " );
            toy.play();
        }        
    }
}
