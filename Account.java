public class Account {


    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    
    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(Double deposit){

        Double currentBalance = deposit + balance;
        this.balance = currentBalance;
        System.out.println("You deposited: " + deposit);
        System.out.println("Your current balance is: " + balance);

    }

    public void withdraw(Double withdraw){

        Double currentBalance = balance - withdraw;
        this.balance = currentBalance;
        System.out.println("You withdrew: " + withdraw);
        System.out.println("Your current balance is: " + balance);
        
       // perform the math here
    }


}
