package observer_win;

public class Test {
    
    public static void main(String[] args) {
        IObserver user1 = new UserObserver("小明");
        IObserver user2 = new UserObserver("小英");
        IObserver user3 = new UserObserver("小華");
        
        ISubject news = new NewsSubject();
        news.add(user1);
        news.add(user2);
        news.add(user3);
        
        news.notifyObserver("開會了");
        
        System.out.println();
        news.remove(user2);
        news.notifyObserver("吃飯了");
        
    }
    
}
