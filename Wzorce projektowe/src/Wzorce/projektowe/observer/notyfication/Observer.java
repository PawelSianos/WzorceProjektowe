package Wzorce.projektowe.observer.notyfication;

import Wzorce.projektowe.observer.Weather.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
