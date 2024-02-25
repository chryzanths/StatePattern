public class ClosedState implements AccountState{



    @Override
    public void activate(){
        System.out.println("You cannot activate a closed account!");
    }


    @Override
    public void close(){
        System.out.println("Account is closed!");
    }

    @Override
    public void suspend(){
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void deposit() {
        System.out.println("You cannot deposit on a closed account!");
    }

    @Override
    public void withdraw() {
        System.out.println("You cannot withdraw on a closed account!");
    }

}