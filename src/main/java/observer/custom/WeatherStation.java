package observer.custom;

import lombok.extern.slf4j.Slf4j;
import observer.custom.observable.WeatherData;
import observer.custom.observers.CurrentConditionDisplay;
import observer.custom.observers.ForecastDisplay;
import observer.custom.observers.StatisticsDisplay;

@Slf4j
public class WeatherStation {

    public static void main(String[] args) {
        log.info("Running with custom version");

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(50, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.removeObserver(statisticsDisplay);

        weatherData.setMeasurements(78, 90, 29.2f);
    }

}