package main.com.Creational_Pattern.Singleton_Pattern;

class Main {
    private String name;
    private int age;

    private static Main instance;

    private Main() {
    }

    private Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Main getInstance( ) {
        if (instance == null) {
            instance = new Main( );
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}

