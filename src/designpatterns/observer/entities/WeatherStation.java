package designpatterns.observer.entities;

import designpatterns.observer.interfaces.ObservableSubject;
import designpatterns.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherStation implements ObservableSubject {
    private List<Observer> observers;
    private int temperature;

    public WeatherStation(int temperature) {
        this.temperature = temperature;
        this.observers = new ArrayList<>();
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyObservers();
    }

    private List<Observer> getObservers() {
        return this.observers;
    }

    public List<Observer> getObserversList() {
        return  Collections.unmodifiableList(this.observers);
    }

    @Override
    public void registerObserver(Observer observer) {
        this.getObservers().add(observer);
        observer.update();
    }

    @Override
    public void unregisterObserver(Observer observer) {
        int index = this.getObservers().indexOf(observer);
        if (index >= 0) {
            this.getObservers().remove(index);
        }

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.getObservers()) {
            observer.update();
        }
    }
}
