package main.com.Behavior_Pattern.Template;

public class Soccer extends Sport{
    @Override
    public void initialize() {
        System.out.println("Welcome to Soccer");
    }

    @Override
    public void start() {
        System.out.println("This match is starting");
    }

    @Override
    public void end() {
        System.out.println("this match is ending");
    }
}
