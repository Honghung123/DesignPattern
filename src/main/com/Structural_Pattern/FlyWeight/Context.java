package main.com.Structural_Pattern.FlyWeight;

public class Context {
    private String id;
    private int star;

    public Context(String id, int star) {
        this.id = id;
        this.star = star;
    }

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public int getStar() {
        return this.star;
    }
    
    public void setStar(int star) {
        this.star = star;
    }
}
