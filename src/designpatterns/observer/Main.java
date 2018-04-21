package designpatterns.observer;

import designpatterns.observer.entities.TemperatureApp;
import designpatterns.observer.entities.WeatherStation;
import designpatterns.observer.interfaces.Observer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation  = new WeatherStation(0);
        TemperatureApp app1 = new TemperatureApp(weatherStation);
        TemperatureApp app2 = new TemperatureApp(weatherStation);
        weatherStation.setTemperature(20);
        for (Observer observer : weatherStation.getObserversList()) {
            System.out.println(observer);
        }

        weatherStation.setTemperature(30);
        for (Observer observer : weatherStation.getObserversList()) {
            System.out.println(observer);
        }


    }
}
