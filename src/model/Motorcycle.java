package model;

public class Motorcycle extends Transport{
    public Motorcycle(String licensePlate, Owner transportOwner, Time hourEntry, Time hourLeave) {
        super(licensePlate, transportOwner, hourEntry, hourLeave, 5000);
    }
}
