public class Account {


    private String accountNumber;
    private Double balance;
    private AccountState accountState;



/*
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(){

        this.accountNumber = accountNumber;
        System.out.println("This is your account number: " + accountNumber);
    }


    public Double getBalance(){
        return balance;
    }

    public void setBalance(){

        this.balance = balance;
        balance.toString();
        System.out.println("This is your current balance: " + balance);
    }


    public AccountState getAccountState(){
        return accountState;
    }

    public void setAccountState(){
        this.accountState = accountState;
    }
 */
    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(Double deposit){
        // perform the math here

    }

    public void withdraw(Double withdraw){
       // perform the math here
    }


}
