package designpatterns.observer.entities;

import designpatterns.observer.interfaces.Observer;

public class TemperatureApp implements Observer {
    private WeatherStation weatherStation;

    private int currentTemperature;

    public TemperatureApp(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    private WeatherStation getWeatherStation() {
        return this.weatherStation;
    }

    void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public int getCurrentTemperature() {
        return this.currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    @Override
    public void update() {
        this.setCurrentTemperature(this.getWeatherStation().getTemperature());
    }

    @Override
    public String toString() {
        return "Temperature is " + this.getCurrentTemperature();
    }
}
