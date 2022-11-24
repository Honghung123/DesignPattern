package main.com.Creational_Pattern.Object_Pool;

public class OliphauntPool extends ObjectPool<Oliphaunt> {

    @Override
    protected Oliphaunt create() {
        return new Oliphaunt();
    }
}
