package observer_win;

public interface ISubject {
    void add(IObserver observer);// 訂閱
    void remove(IObserver observer);// 取消訂閱
    void notifyObserver(Object data); // 發送資料給 Observer
}
