package main.com.Creational_Pattern.Abstract_Factory_Pattern;

import main.com.Creational_Pattern.Abstract_Factory_Pattern.implementss.Red;

public class ColorFactory implements AbtractFactory<Color> {
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
