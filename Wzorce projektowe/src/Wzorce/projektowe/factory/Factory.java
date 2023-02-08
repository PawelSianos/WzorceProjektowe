package Wzorce.projektowe.factory;

import Wzorce.projektowe.factory.cars.BMWModel;
import Wzorce.projektowe.factory.cars.Car;
import Wzorce.projektowe.factory.cars.FordModel;

public interface Factory {
    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);
}
