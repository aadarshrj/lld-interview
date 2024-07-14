package StrategyPattern;

import StrategyPattern.driveStrategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
