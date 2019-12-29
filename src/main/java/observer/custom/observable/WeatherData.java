package observer.custom.observable;

import observer.custom.observers.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherData implements Subject {

    // strive for loosely coupled designs between objects that interact
    private List<Observer> observers = new ArrayList<>();

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().update(this);
        }
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}