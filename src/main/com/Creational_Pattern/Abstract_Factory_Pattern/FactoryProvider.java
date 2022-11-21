package main.com.Creational_Pattern.Abstract_Factory_Pattern;

public class FactoryProvider {
    public static AbtractFactory getFactory(EntityType entityType) {
        if (entityType.equals(EntityType.ANIMAL)) { 
            return new AnimalFactory();
        }
        if (entityType.equals(EntityType.COLOR)) {
            return new ColorFactory();
        }
        else
            return null;
    }
}
