package model;

public class Time {
    private int hour;
    private int minute;

    //Constructor
    public Time(int hour, int minute){

        if (hour <= 0 || hour > 24 || minute < 0 || minute > 59){
            throw new IllegalArgumentException("Hour or minute out of range");
        }

        this.hour = hour;
        this.minute = minute;

    }

    //Concatenate the hour

    public String concatenateTime(){
        String hour = String.valueOf(this.hour);
        String minute = String.valueOf(this.minute);

        return hour + ":" + minute;
    }

    //Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

}
