package main.com.Creational_Pattern.Object_Pool;

public class Oliphaunt {

    private static int counter = 1;

    private final int id;
 

    /**
     * Constructor
     */
    public Oliphaunt() {
        id = counter++; 
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() { 
        return id;
    }
    
    public static void getCounter() {
        System.out.println("Counters: " + counter);
    }
    
    @Override
    public String toString() {
        return String.format("Oliphaunt id=%d", id);
    }
}
