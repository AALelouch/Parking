package model;

public class Transport {

    private String licensePlate;
    private Owner transportOwner;
    private Time hourEntry;
    private Time hourLeave;
    private Time[] arrayOfTime;
    private int hours;
    private int totalPrice;
    private int priceForHour;

    public Transport(String licensePlate, Owner transportOwner, Time hourEntry, Time hourLeave, int priceForHour){
        validateLicencePlate(licensePlate);
        this.licensePlate = licensePlate;
        this.transportOwner = transportOwner;
        this.hourEntry = hourEntry;
        this.hourLeave = hourLeave;
        this.arrayOfTime = new Time[]{this.hourEntry, this.hourLeave};
        this.priceForHour = priceForHour;

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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getPriceForHour() {
        return priceForHour;
    }

    public void setPriceForHour(int priceForHour) {
        this.priceForHour = priceForHour;
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

    //Method for calculate the number of hours
    public void calculateNumberOfHours(){
        this.hours = ((hourLeave.getHour())+(hourLeave.getMinute()/60))-((hourEntry.getHour())+(hourEntry.getMinute()/60));
        this.hours = Math.abs(this.hours);
    }

    //Method for calculate the final price
    public void calculateFinalPrice(){
        this.totalPrice = this.hours * this.priceForHour;
    }

}
