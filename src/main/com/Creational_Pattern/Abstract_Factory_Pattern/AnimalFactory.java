package main.com.Creational_Pattern.Abstract_Factory_Pattern;

import main.com.Creational_Pattern.Abstract_Factory_Pattern.implementss.Cat;

public class AnimalFactory implements AbtractFactory<Animal> {
    @Override
    public Animal create(String entity) {
        switch (entity) {
            case "Cat": {
                return new Cat(); 
            }
            default: {
                return null; 
            }

        }
    }
}
