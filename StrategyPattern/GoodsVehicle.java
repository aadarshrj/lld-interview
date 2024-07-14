package StrategyPattern;

import StrategyPattern.driveStrategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
