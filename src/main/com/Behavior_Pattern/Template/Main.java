package main.com.Behavior_Pattern.Template;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class c = Class.forName(args[0]);
        Sport sport = (Sport) c.newInstance();
        sport.play();
    }
}
