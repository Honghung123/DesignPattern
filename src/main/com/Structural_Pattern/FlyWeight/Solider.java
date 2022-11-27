package main.com.Structural_Pattern.FlyWeight;

public class Solider implements ISolider {
    private final String name;

    public Solider(String name) {
        this.name = name;
        System.out.println("Created solider with name: " + name);
    }

    public String getName() {
        return this.name;
    }

    public void promote(Context context) {
        System.out.println("Promote name: " + this.name + " ===  id: " + context.getId() + "  ===  Star: " + context.getStar());
    }
}
