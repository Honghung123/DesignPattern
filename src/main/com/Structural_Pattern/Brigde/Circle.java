package main.com.Structural_Pattern.Brigde;

public class Circle implements Sharp {
    private Color color;

    public Circle(Color color) {
        this.color = color;
    } 

    @Override
    public void getSharp() {
        color.getColor();
        System.out.println("Sharp: Circle");
    }
}
