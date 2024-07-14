package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String mobile;
    StockObservable observable;

    public MobileAlertObserverImpl(String mobile , StockObservable observable){
        this.mobile = mobile;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessage(mobile , "Stock is up now!!");
    }
    public void sendMessage(String mobile , String message) {
        System.out.println(mobile+"-"+message);
    }
}
