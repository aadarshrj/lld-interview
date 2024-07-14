package StrategyPattern.driveStrategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Driving");
    }
}
