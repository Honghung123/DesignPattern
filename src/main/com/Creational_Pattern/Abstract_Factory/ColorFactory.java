package main.com.Creational_Pattern.Abstract_Factory;

import main.com.Creational_Pattern.Abstract_Factory.implementss.Red;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String entity) {
        switch (entity) {
            case "Red": {
                return new Red(); 
            }
            default: {
                return null; 
            }

        }
    }
 
    
}
