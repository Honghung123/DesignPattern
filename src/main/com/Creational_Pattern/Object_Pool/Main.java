package main.com.Creational_Pattern.Object_Pool;

import java.util.logging.Logger;

public class Main { 

    public static void main(String[] args) {
        OliphauntPool pool = new OliphauntPool(); 
        Oliphaunt oliphaunt = pool.checkOut(); 
    }
}
