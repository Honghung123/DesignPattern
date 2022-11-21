package main.com.Creational_Pattern.Singleton_Pattern;

public class Singleton {

    public static void main(String[] args) {
        System.out.println("--- Singleton Pattern ---");
        Main single1 = Main.getInstance( );
        Main single2 = Main.getInstance( );
        if (single1.equals(single2)) {
            System.out.println("Unique Instance");
        }
        System.out.println(single1);
        System.out.println(single2);
    }
}
    