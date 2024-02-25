public class AccountContext
{
    public AccountState state;

    public void setState(AccountState state) {
        this.state = state;
    }

    public void activate(){
        state.activate();
    }

    public void close(){
        state.close();
    }

    public void suspend(){
        state.suspend();
    }

    public void deposit(){
        state.deposit();
    }
    public void withdraw(){
        state.withdraw();
    }

}
