public class AccountTest {

    public static void main(String[] args){
        Account myAccount = new Account("1234", 10000.0);

        AccountContext context = new AccountContext();
        context.setState(new ActiveState());

        System.out.println("Your account number: " + myAccount.accountNumber() + "\n");

        //Suspend the account
        context.suspend();

        //Activate the account
        context.activate();

        //Deposit to the account
        myAccount.deposit(1000.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().

        //Withdraw to the account
        myAccount.withdraw(100.0);// update balance and displays account number and
        // current balance. Call the toString() method in deposit().

        //Close the account()
        context.close();

        context.setState(new ClosedState());

        //Activate the account
        context.activate(); // Displays "You cannot activate a closed account!"

        //Suspend the account
        context.activate(); // Displays " You cannot suspend a closed account!"


        //Withdraw to the account
        context.withdraw();// Show message "You cannot withdraw on a closed account!".
        // Call the toString() to show current balance and account number.
        myAccount.withdraw(0.0);

        //Deposit to the account
        context.deposit();// Show message "You cannot deposit on closed
        // account displays account!". Call the toString() to show current balance and account number.
        myAccount.deposit(0.0);
    }

}

