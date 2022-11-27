package main.com.Structural_Pattern.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class SoliderFactory {
    private static final Map<String, ISolider> soliders = new HashMap<>();

    private SoliderFactory() {
        throw new IllegalStateException();
    }

    public static synchronized ISolider createSolider(String name) {
        ISolider solider = soliders.get(name);
        if (solider == null) {
            wait1000miliseconds();
            solider = new Solider(name);
            soliders.put(name, solider);
        }
        return solider;
    }

    public static synchronized int getTotalSolider() {
        return soliders.size();
    }

    public static void wait1000miliseconds( ) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new InternalError();
        }
    }
}
