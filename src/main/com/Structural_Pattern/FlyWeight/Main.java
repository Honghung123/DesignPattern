package main.com.Structural_Pattern.FlyWeight;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<ISolider> soldiers = new ArrayList<>();

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Yuri", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Akane", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
        System.out.println("Total type of soldiers made : " + SoliderFactory.getTotalSolider());
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 1; i <= numberOfSoldier; i++) {
            Context context = new Context("Soldier" + (soldiers.size() + 1), numberOfStar);
            ISolider soldier = SoliderFactory.createSolider(soldierName);
            soldier.promote(context);
            soldiers.add(soldier);
        }
    }
}
