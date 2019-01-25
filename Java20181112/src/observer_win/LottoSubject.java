package observer_win;

import java.util.ArrayList;
import java.util.List;

public class LottoSubject implements ISubject {
    private List<IObserver> list = new ArrayList<>();
    @Override
    public void add(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(Object data) {
        for(IObserver observer:list) {
            observer.update(data);
        }
    }
    
}
