public class Account {


    private String accountNumber;
    private Double balance;
    //private AccountContext context;

    
    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(Double deposit){

        Double currentBalance = deposit + balance;
        this.balance = currentBalance;
        System.out.println("You deposited: " + deposit);
        System.out.println("Your current balance is: " + balance);

        // note to self: perform the math here

    }

    public void withdraw(Double withdraw){

        Double currentBalance = balance - withdraw;
        balance = currentBalance;
        System.out.println("You withdrew: " + withdraw);
        System.out.println("Your current balance is: " + balance);
        
       // note to self: perform the math here
    }

    public String accountNumber() {
        return "Your account number is: " + accountNumber;
    }
}
