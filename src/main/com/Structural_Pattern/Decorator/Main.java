package main.com.Structural_Pattern.Decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        IPizza tomato = new TomatoPizza();
        IPizza chicken = new ChickenPizza();
        PapperDeco papper_tomato = new PapperDeco(tomato);
        System.out.println(papper_tomato.doPizza());
        PapperDeco papper_chiken = new PapperDeco(chicken);
        System.out.println(papper_chiken.doPizza());
        CreamDeco cream_chicken = new CreamDeco(chicken);
        System.out.println(cream_chicken.doPizza());
        
        PapperDeco papper_cream_chiken = new PapperDeco(cream_chicken);
        System.out.println(papper_cream_chiken.doPizza());
        CheeseDeco cheese_papper_cream_chiken = new CheeseDeco(papper_cream_chiken);
        System.out.println(cheese_papper_cream_chiken.doPizza());



        do {
            System.out.print("========= Food Menu ============ \n");
            System.out.print("            1. Vegetarian Food.   \n");
            System.out.print("            2. Non-Vegetarian Food.\n");
            System.out.print("            3. Chineese Food.         \n");
            System.out.print("            4. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1: {
                    Food vf = new VegFood();
                    System.out.println(vf.prepareFood());
                    System.out.println(vf.foodPrice());
                    break;
                }

                case 2: {
                    Food f1 = new NonVegFood((Food) new VegFood()); 
                    System.out.println(f1.prepareFood());
                    System.out.println(f1.foodPrice()); 
                    break;
                }
                case 3: {
                    Food f2 = new ChineseFood((Food) new MeatFood());
                    System.out.println(f2.prepareFood());
                    System.out.println(f2.foodPrice());
                    break;
                }

                default: {
                    System.out.println("Other than these no food available");
                    return;
                }
            }// end of switch

        } while (choice != 4);
    }
}
