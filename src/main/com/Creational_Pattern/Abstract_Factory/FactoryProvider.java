package main.com.Creational_Pattern.Abstract_Factory;

public class FactoryProvider {
    public static AbstractFactory getFactory(EntityType entityType) {
        if (entityType.equals(EntityType.ANIMAL)) { 
            return new AnimalFactory();
        }
        if (entityType.equals(EntityType.COLOR)) {
            return new ColorFactory();
        }
        if (entityType.equals(EntityType.TOY)) {
            return new ToyFactory();
        }
        else
            return null;
    }
}
