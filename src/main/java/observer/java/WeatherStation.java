package observer.java;

import lombok.extern.slf4j.Slf4j;
import observer.java.observable.WeatherData;
import observer.java.observers.CurrentConditionDisplay;
import observer.java.observers.ForecastDisplay;
import observer.java.observers.StatisticsDisplay;

@Slf4j
public class WeatherStation {

    public static void main(String[] args) {
        log.info("Running with java version");

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.deleteObserver(statisticsDisplay);

        weatherData.setMeasurements(78, 90, 29.2f);
    }

}