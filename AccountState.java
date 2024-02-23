public interface AccountState {

    void activate();
    void suspend();
    void close();
    void deposit();
    void withdraw();

}
