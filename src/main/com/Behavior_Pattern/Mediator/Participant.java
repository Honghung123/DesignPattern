package main.com.Behavior_Pattern.Mediator;

public abstract class Participant {
    public abstract void sendMessage(String message);

    public abstract void setname(String name);

    public abstract String getName();
}
