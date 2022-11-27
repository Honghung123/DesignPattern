package main.com.Behavior_Pattern.Observer;

import java.util.ArrayList;
import java.util.List;

// Subject.java
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    } 
}
