package main.com.Behavior_Pattern.Mementor;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Mementor> mementorList = new ArrayList<Mementor>();

    public void add(Mementor mementor) {
        mementorList.add(mementor);
    }

    public Mementor get(int index) {
        return mementorList.get(index);
    }
}
