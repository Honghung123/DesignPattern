package main.com.Creational_Pattern.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Singleton Pattern ---");
        Singleton single1 = Singleton.getInstance( );
        Singleton single2 = Singleton.getInstance( );
        if (single1.equals(single2)) {
            System.out.println("Unique Instance");
        }
        System.out.println(single1);
        System.out.println(single2);
    }
}
    