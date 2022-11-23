package main.com.Structural_Pattern.Adapter;

public class BankUser implements VisaCard {
    BankDetails bankDetails;
    public BankUser(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    } 
    @Override
    public void getCondition(String result) {
        String message;
        if (result.endsWith("passed")) {
            message = "Your account is Actived";
        } else {
            message = "Sorry, cannot get account";
        }
        bankDetails.getCondition(message);
    } 
}
