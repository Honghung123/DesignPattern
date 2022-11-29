package main.com.Creational_Pattern.Abstract_Factory;

import main.com.Creational_Pattern.Abstract_Factory.implementss.Cat;

public class AnimalFactory implements AbstractFactory<Animal> {
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
