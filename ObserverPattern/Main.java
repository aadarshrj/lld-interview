package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StockObservable observable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("8789",observable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("hotmail",observable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("999",observable);
        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("gmail",observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);
        observable.add(observer4);

        observable.setStockCount(20);

    }
}
