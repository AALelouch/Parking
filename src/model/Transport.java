package model;

public class Transport {

    private String licensePlate;
    private Owner transportOwner;
    private Time hourEntry;
    private Time hourLeave;
    private Time[] arrayOfTime;

    public Transport(String liscensePlate, Owner transportOwner, Time hourEntry, Time hourLeave){
        validateLicencePlate(liscensePlate);
        this.transportOwner = transportOwner;
        this.hourEntry = hourEntry;
        this.hourLeave = hourLeave;
        this.arrayOfTime = new Time[]{this.hourEntry, this.hourLeave};

    }

    //Getter and Setter
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Owner getTransportOwner() {
        return transportOwner;
    }

    public void setTransportOwner(Owner transportOwner) {
        this.transportOwner = transportOwner;
    }

    public Time getHourEntry() {
        return hourEntry;
    }

    public void setHourEntry(Time hourEntry) {
        this.hourEntry = hourEntry;
    }

    public Time getHourLeave() {
        return hourLeave;
    }

    public void setHourLeave(Time hourLeave) {
        this.hourLeave = hourLeave;
    }

    public Time[] getArrayOfTime() {
        return arrayOfTime;
    }

    public void setArrayOfTime(Time[] arrayOfTime) {
        this.arrayOfTime = arrayOfTime;
    }

    //Validator
    public void validateLicencePlate(String plate) {
        for (int i = 0; i <= 3; i++) {
            if (Character.isDigit(plate.charAt(i))) {
                throw new IllegalArgumentException("Invalid data");
            }
        }
        for (int i = 4; i <= 6; i++) {
            if (!Character.isDigit(plate.charAt(i))) {
                throw new IllegalArgumentException("Invalid data");
            }
        }
    }
}
