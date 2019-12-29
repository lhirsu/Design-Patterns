package observer.custom.observers;

import lombok.extern.slf4j.Slf4j;
import observer.custom.observable.Subject;
import observer.custom.observable.WeatherData;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {

    private List<Float> temperatures = new ArrayList<>();

    // strive for loosely coupled designs between objects that interact
    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (temperatures.size() > 1) {
            if (temperatures.get(temperatures.size() - 1) >= temperatures.get(temperatures.size() - 2)) {
                log.info("Improving weather on the way!");
            } else {
                log.info("Watch out for cooler weather");
            }
        } else {
            log.info("Not enough data for a forecast");
        }
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            temperatures.add(weatherData.getTemperature());
            display();
        }
    }

}