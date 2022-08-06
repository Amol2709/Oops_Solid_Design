package _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.Observable;

import java.util.ArrayList;
import java.util.List;

import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.NotificationObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.StockObservable;

public class IphoneObservable implements StockObservable{

    public List<NotificationObserver> observerList = new ArrayList<>();
    public int iphoneStock = 0;
    public String whoAmI;

    @Override
    public void setStock(int iphoneStock){
        this.iphoneStock = this.iphoneStock+iphoneStock;
        if (this.iphoneStock==0){
            notifySubscriber();
        }
    }

    @Override
    public void Add(NotificationObserver observer){
        observerList.add(observer);
    }

    @Override
    public void Remove(NotificationObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifySubscriber(){
        for (NotificationObserver observer: observerList){
            observer.update();
        }
    }
}