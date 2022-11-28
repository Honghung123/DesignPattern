package main.com.Behavior_Pattern.Template;

public abstract class Sport {
    public abstract void initialize();
    public abstract void start();

    public abstract void end();
    
    public final void play(){
        initialize();
        start();
        end();
    }
}
