package observer.java.observers;

import lombok.extern.slf4j.Slf4j;
import observer.java.observable.WeatherData;

import java.util.*;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {
    List<Float> temperatures = new ArrayList<>();

    public StatisticsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        log.info("Avg/Max/Min temperature = " + getAvg() + "/" + getMax() + "/" + getMin());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperatures.add(weatherData.getTemperature());
            display();
        }
    }

    private Float getMin() {
        return temperatures.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    private Float getMax() {
        return temperatures.stream().max(Comparator.naturalOrder()).orElse(null);
    }

    private Float getAvg() {
        return temperatures.stream().reduce((t1, t2) -> (t1 + t2) / 2).orElse(null);
    }

}