package main.com.Creational_Pattern.Object_Pool;
 
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class ObjectPool<T> {

    private Set<T> available = new HashSet<>();
    private Set<T> inUse = new HashSet<>();

    protected abstract T create();

    /**
     * Checkout object from pool - Lay ra
     */
    public synchronized T checkOut() {
        if (available.isEmpty()) {
            System.out.println("Created new object");
            available.add(create());
        }
        T instance = available.iterator().next();
        System.out.println(instance);
        available.remove(instance);
        inUse.add(instance);
        return instance;
    }

    
    /**
     * Thu hoi instance
     */
    public synchronized void checkIn(T instance) {
        inUse.remove(instance);
        available.add(instance);
    }

    public void getList() {
        
        System.out.println("--------------- List of instances");
        if (available.size() != 0) {
            Iterator<T> it = available.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
        System.out.println("--------------- List of inUse");
        if (inUse.size() != 0) {
            Iterator<T> it = inUse.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
    }
}
