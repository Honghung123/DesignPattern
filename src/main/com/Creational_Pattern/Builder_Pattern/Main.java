package main.com.Creational_Pattern.Builder_Pattern;  

class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount.BankAccountBuilder()
                .Name("Jon")
                .AccountNumber( "22738022275")
                .Email("jon@example.com")
                .Newsletter(true)
                .build();
         
        BankAccount newAccount2 = new BankAccount.BankAccountBuilder()
                .Name("Hung") 
                .Email("jon@example.com")
                .Newsletter(true)
                .build();
         
        System.out.println(newAccount); 
        System.out.println(newAccount2); 
    }

}