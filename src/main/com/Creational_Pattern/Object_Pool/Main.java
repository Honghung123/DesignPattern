package main.com.Creational_Pattern.Object_Pool;
 

public class Main { 

    public static void main(String[] args) {
        OliphauntPool pool = new OliphauntPool();
        
        Oliphaunt oliphaunt = pool.checkOut();
        Oliphaunt.getCounter();
        oliphaunt.getId();
        System.out.println(pool);

        Oliphaunt oliphaunt2 = pool.checkOut();
        Oliphaunt.getCounter();
        oliphaunt2.getId(); 
        System.out.println(pool);

        Oliphaunt oliphaunt3 = pool.checkOut();
        Oliphaunt.getCounter();
        oliphaunt3.getId(); 
        System.out.println(pool);
        
        pool.getList();

        pool.checkIn(oliphaunt2); 
        System.out.println(pool);
        pool.checkIn(oliphaunt3); 
        System.out.println(pool);
        pool.checkIn(oliphaunt); 
        System.out.println(pool);

        pool.getList();

        // Get the instance if it exists in the pool, Lay theo thu tu cac instance da thu hoi truoc do, theo co che FIFO
        Oliphaunt oliphaunt4 = pool.checkOut();
        System.out.println("Is Oliphaunt4 is Oliphaunt:  " + oliphaunt.equals(oliphaunt4));
        oliphaunt4.getId();
        System.out.println(pool);
        Oliphaunt oliphaunt5 = pool.checkOut();
        System.out.println("Is Oliphaunt5 is Oliphaunt:  " + oliphaunt.equals(oliphaunt5));
        oliphaunt5.getId();
        System.out.println(pool);
    }
}
