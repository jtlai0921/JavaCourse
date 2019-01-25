package lab49;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public synchronized void setBalance(int balance) {
        this.balance = balance;
    }
    
    public synchronized void 提款(int money) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + "開始提款");
        int currentBalance = getBalance();
        if(currentBalance >= money) {
            System.out.println("餘額充足");
            for(int i=0;i<100000000;i++); // 模擬提款程序
            currentBalance = currentBalance - money;
            setBalance(currentBalance);
            System.out.println(tName + "提款成功");
        } else {
            System.out.println("餘額不足");
            System.out.println(tName + "提款失敗");
        }
        // 列印明細
        System.out.println("列印明細: " + tName + "提款 $" + money + ", 餘額 $" + getBalance());
    }
    
}
