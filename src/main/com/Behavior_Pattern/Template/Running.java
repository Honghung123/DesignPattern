package main.com.Behavior_Pattern.Template;

public class Running extends Sport{
    @Override
    public void initialize() {
        System.out.println("Welcome to Running");
    }

    @Override
    public void start() {
        System.out.println("This running is starting");
    }

    @Override
    public void end() {
        System.out.println("This match will end in few seconds");
    }
}
