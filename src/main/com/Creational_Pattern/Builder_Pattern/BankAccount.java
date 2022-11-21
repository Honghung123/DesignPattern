package main.com.Creational_Pattern.Builder_Pattern;

public class BankAccount {

    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;
    
    public static class BankAccountBuilder {

        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;
        
        public BankAccountBuilder() { 
        }
        
        public BankAccountBuilder Name(String name) {
            this.name = name;
            return this;
        }
        
        public BankAccountBuilder AccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }
        
        public BankAccountBuilder Email(String email) {
            this.email = email;
            return this;
        }
        
        public BankAccountBuilder Newsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }
        
        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    public BankAccount() {
    }

    private BankAccount(BankAccountBuilder p) {
        this.name = p.name;
        this.accountNumber = p.accountNumber;
        this.email = p.email;
        this.newsletter = p.newsletter;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + ", AccountNumber: " + this.accountNumber
                + ", Email: " + this.email + ", newsletter: " + this.newsletter;
    }
}
