public class ActiveState implements AccountState{



    @Override
    public void activate(){
        System.out.println("Account is already active!");
    }

    @Override
    public void suspend(){
        System.out.println("Account is suspended!");
    }

    @Override
    public void close(){
        System.out.println("Account is closed!");
    }

    @Override
    public void deposit() {

    }

    @Override
    public void withdraw() {

    }


}