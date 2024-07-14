package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
   private int count;
   private List<NotificationAlertObserver> observerList = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obj : observerList){
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(count == 0){
            notifySubscribers();
        }
        count += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return count;
    }
}
