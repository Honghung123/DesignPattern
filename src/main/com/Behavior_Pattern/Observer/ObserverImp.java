package main.com.Behavior_Pattern.Observer;

public class ObserverImp implements Observer {
    public void update(String message) {
        System.out.println("Make changed: " + message);
    }
}
