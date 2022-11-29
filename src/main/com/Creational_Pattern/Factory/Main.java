package main.com.Creational_Pattern.Factory;

public class Main {
   public static void main(String[] args) {
       Bank bank = BankFactory.getBank(BankType.TPBANK);
       System.out.println(bank instanceof TPBank);
       System.out.println(bank.getName());
       bank = BankFactory.getBank(BankType.VIETCOMBANK);
       System.out.println(bank instanceof VietcomBank);
       System.out.println(bank.getName()); 
   }

}
