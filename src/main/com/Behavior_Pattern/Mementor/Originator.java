package main.com.Behavior_Pattern.Mementor;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public Mementor saveStateToMementor() {
        return new Mementor(state);
    }

    public void getStateFromMementor(Mementor mementor) {
        state = mementor.getState();
    } 
}
