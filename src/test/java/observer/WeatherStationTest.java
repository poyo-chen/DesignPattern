package observer;

import observer.observer.CurrentConditionsDisplay;
import observer.observer.ForecastDisplay;
import observer.observer.StatisticsDisplay;
import observer.subject.WeatherData;
import org.junit.jupiter.api.Test;

public class WeatherStationTest {

  @Test
  void testCurrentConditionsDisplay() {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay conditionsDisplay =
        new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);
  }

}
