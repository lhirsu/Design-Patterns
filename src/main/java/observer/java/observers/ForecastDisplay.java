package observer.java.observers;

import lombok.extern.slf4j.Slf4j;
import observer.java.observable.WeatherData;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {
    private List<Float> temperatures = new ArrayList<>();

    public ForecastDisplay(Observable weatherData) {
        weatherData.addObserver(this);
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
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperatures.add(weatherData.getTemperature());
            display();
        }
    }
}