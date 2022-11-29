package main.com.Creational_Pattern.Abstract_Factory;

import main.com.Creational_Pattern.Abstract_Factory.implementss.Plane;

public class ToyFactory implements AbstractFactory<Toy>{

    @Override
    public Toy create(String classType) {
        switch (classType) {
            case "Plane":
                return new Plane();  
            default:
                return null;
        }
    }
    
}
