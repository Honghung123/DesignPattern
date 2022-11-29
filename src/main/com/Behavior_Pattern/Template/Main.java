package main.com.Behavior_Pattern.Template;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Sport sport = new Running();
        sport.play();
        System.out.println();
        sport = new Soccer();
        sport.play();
    }
}
