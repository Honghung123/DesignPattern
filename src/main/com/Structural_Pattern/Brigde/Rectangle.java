package main.com.Structural_Pattern.Brigde;

public class Rectangle implements Sharp {
    private Color color;

    Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void getSharp() {
        color.getColor();
        System.out.println("Sharp: Rectangle");    
    }
    
}
