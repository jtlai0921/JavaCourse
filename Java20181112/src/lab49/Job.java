package lab49;

public class Job implements Runnable {
    private Account account;
    private int money;
    
    public Job(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.提款(money);
    }
    
    
}
