package main.com.Creational_Pattern.Singleton;

class Singleton {
    private String name;
    private int age;

    private static Singleton instance;

    private Singleton() {
    }

    private Singleton(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Singleton getInstance() {
        // Lazy initialization trong truong hop 1 luong thread
        if (instance == null) {
            instance = new Singleton();
        }
        
        // Truong hop multi-thread
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance  = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}

