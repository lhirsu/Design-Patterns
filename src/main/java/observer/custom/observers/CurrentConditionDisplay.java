package observer.custom.observers;

import lombok.extern.slf4j.Slf4j;
import observer.custom.observable.Subject;
import observer.custom.observable.WeatherData;

@Slf4j
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    // strive for loosely coupled designs between objects that interact
    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

}