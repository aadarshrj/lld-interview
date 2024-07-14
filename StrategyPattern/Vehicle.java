package StrategyPattern;

import StrategyPattern.driveStrategy.DriveStrategy;

public class Vehicle {
    DriveStrategy ds;

    public Vehicle(DriveStrategy ds){
        this.ds = ds;
    }
    public void drive(){
        ds.drive();
    }
}
