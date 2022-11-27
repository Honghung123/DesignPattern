package main.com.Behavior_Pattern.Observer;

// Main.java
public class Main {
  public static void main(String[] args) {
    Subject subject = new Subject();
    
    Observer observer1 = new ObserverImp() ;
    subject.add(observer1);

    Observer observer2 = new Observer() {
        public void update(String message) {
            System.out.println("Message 2 changed: " + message);
        }
    };
    subject.add(observer2);

    subject.notifyChange("Test change state 1");
    subject.remove(observer1);
    
    subject.notifyChange("Test change state 2");
  }
}
