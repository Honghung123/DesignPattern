package main.com.Structural_Pattern.Adapter;

public class BankDetails {
    private String bankName;
    private String accHolderName;
    private long accNumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public void getCondition(String message) {
        System.out.println(
                "you passed " + message + " HNam: " + getAccHolderName() + " Account: " + getAccNumber() + " bankName: "
        + getBankName());
    }
    
    public void getOverride( ) {
        System.out.println("you called BankDetails"  );
    }
}
