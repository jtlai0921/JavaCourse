package lab46;

class Worker extends Thread { // 瓦斯工人
    public void run() {
        System.out.println("工人開始送瓦斯");
        for(int i=1;i<=5;i++) {
            System.out.println("工人送瓦斯中:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("工人發生意外");
            }
        }
        System.out.println("工人瓦斯送達並安裝完畢");
    }
}

class Father extends Thread { // 爸爸
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯了");
        System.out.println("爸爸打電話叫瓦斯");
        
        Worker worker = new Worker();
        worker.start();
        
        try {
            worker.join(10000);
        } catch (Exception e) {
        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

public class Shower {
    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}
