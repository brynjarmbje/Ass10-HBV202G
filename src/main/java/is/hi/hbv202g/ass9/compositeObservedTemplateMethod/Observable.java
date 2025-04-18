package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;
public abstract class Observable {
    private List<Observer> observers;
    public Observable() {
        observers=new ArrayList<Observer>();
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}