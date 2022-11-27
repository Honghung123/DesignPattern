package main.com.Behavior_Pattern.Mementor;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();

        Caretaker careTaker = new Caretaker();

        originator.setState("State #1");
        careTaker.add(originator.saveStateToMementor());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMementor());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMementor());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMementor(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMementor(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMementor(careTaker.get(2));
        System.out.println("Third saved State: " + originator.getState());
    }

}
