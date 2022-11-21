package main.com.Creational_Pattern.Factional_Pattern;

public class Main {
   public static void main(String[] args) {
       Bank bank = BankFactory.getBank(BankType.TPBANK);
       System.out.println(bank instanceof TPBank);
       System.out.println(bank.getName());
   }

}
