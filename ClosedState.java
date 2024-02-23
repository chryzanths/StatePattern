public class ClosedState implements AccountState{

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

    @Override
    public void activate(){
        System.out.println("You cannot activate a closed account!");
    }


    @Override
    public void suspend(){
        System.out.println("You cannot suspend a closed account!");
    }
}