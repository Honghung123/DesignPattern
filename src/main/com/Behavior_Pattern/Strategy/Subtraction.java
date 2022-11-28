package main.com.Behavior_Pattern.Strategy;

public class Subtraction implements Strategy{
    @Override
    public int calculation(int a, int b) {
        return a - b;
    }
}
