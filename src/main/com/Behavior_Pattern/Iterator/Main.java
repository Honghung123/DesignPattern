package main.com.Behavior_Pattern.Iterator;

public class Main {
    public static void main(String[] args) {
        CollectionOfNames cmpnyRepository = new CollectionOfNames();

        for (Iterators iter = cmpnyRepository.getIterators(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
