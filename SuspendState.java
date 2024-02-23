public class SuspendState implements AccountState{

    @Override
    public void suspend(){
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(){
        System.out.println("Account is activated!");
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }

    @Override
    public void close(){
        System.out.println("Account is closed!");
    }
}
