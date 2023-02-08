package Wzorce.projektowe.factory;

import Wzorce.projektowe.factory.cars.BMWModel;
import Wzorce.projektowe.factory.cars.Car;
import Wzorce.projektowe.factory.cars.FordModel;

public class Main {

    public static void main(String[] args) {


        Factory britishFactory = new BritishFactory();
        Factory europeanFactory = new EuropeanFactory();

        Car bmw = britishFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getPosition());

        Car ford = europeanFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getPosition());

    }
}
