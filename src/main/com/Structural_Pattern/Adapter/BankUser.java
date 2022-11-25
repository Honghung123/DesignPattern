package main.com.Structural_Pattern.Adapter;

public class BankUser implements VisaCard {
    public BankCustomer bankCustomer;
    public BankUser(BankCustomer BankCustomer) {
        this.bankCustomer = BankCustomer;
    } 
    @Override
    public void getCondition(String result) {
        String message;
        if (result.endsWith("passed")) {
            message = "Your account is Actived";
        } else {
            message = "Sorry, cannot get account";
        }
        bankCustomer.getCondition(message);
    } 
}
