package Wzorce.projektowe.factory;

import Wzorce.projektowe.factory.cars.*;

public class EuropeanFactory implements Factory{


    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    public Car buildFord(FordModel model) {
        switch(model){
            case CMAX:
                return new Ford("1.6", "GAS", "2001", position);
            case FOCUS:
                return new Ford("2.0", "DIESEL", "2012", position);
            default:
                throw new IllegalStateException("no such model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW("2.2", "DIESEL", "2022", position);
            case E60:
                return new BMW("3.0", "DIESEL", "2021", position);
            default:
                throw new IllegalStateException("no such model");
        }
    }
}
