package observer.java.observers;

import lombok.extern.slf4j.Slf4j;

import observer.java.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        log.info("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

}