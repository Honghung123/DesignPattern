package main.com.Creational_Pattern.Abstract_Factory.implementss;

import main.com.Creational_Pattern.Abstract_Factory.Toy;

public class Plane implements Toy{
    @Override
    public void getName() {
        System.out.println("This is a plane");
    }

    @Override
    public void play() {
        System.out.println("Plane is flying");
    }
}
