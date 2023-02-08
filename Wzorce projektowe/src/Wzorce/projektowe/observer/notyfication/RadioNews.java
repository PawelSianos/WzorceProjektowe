package Wzorce.projektowe.observer.notyfication;

import Wzorce.projektowe.observer.Weather.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura:" + weatherForecast.getTemperature() + "stopni, ciśnienie: "
                + weatherForecast.getPressure() +"hPa");
    }
}
