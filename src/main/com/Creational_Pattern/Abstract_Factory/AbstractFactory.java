package main.com.Creational_Pattern.Abstract_Factory;

public interface AbstractFactory<T> {
    public T create(String classType);    
}
