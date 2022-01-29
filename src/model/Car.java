package model;

public class Car extends Transport{
    public Car(String licensePlate, Owner transportOwner, Time hourEntry, Time hourLeave) {
        super(licensePlate, transportOwner, hourEntry, hourLeave, 8000);
    }
}
