package observer.custom.observers;

import lombok.extern.slf4j.Slf4j;
import observer.custom.observable.Subject;
import observer.custom.observable.WeatherData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {

    private List<Float> temperatures = new ArrayList<>();

    // strive for loosely coupled designs between objects that interact
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        log.info("Avg/Max/Min temperature = " + getAvg() + "/" + getMax() + "/" + getMin());
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
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