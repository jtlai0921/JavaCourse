package lab49;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000);
        
        Job job1 = new Job(account, 5000);
        Job job2 = new Job(account, 4000);
        Job job3 = new Job(account, 2000);
        
        Thread t1 = new Thread(job1, "小明");
        Thread t2 = new Thread(job2, "小華");
        Thread t3 = new Thread(job3, "小英");
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}
