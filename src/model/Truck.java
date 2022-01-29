package model;

public class Truck extends Transport{
    public Truck(String licensePlate, Owner transportOwner, Time hourEntry, Time hourLeave) {
        super(licensePlate, transportOwner, hourEntry, hourLeave, 12000);
    }
}
