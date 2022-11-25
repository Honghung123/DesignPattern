package main.com.Structural_Pattern.Adapter;

public class Main {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        String message = targetInterface.getCreditCard();
        System.out.println(message);
        // BankDetails bankDetails = new BankDetails();
        VisaCard visa = new BankUser(((BankCustomer)targetInterface)); 
        visa.getCondition(message);
    }
}