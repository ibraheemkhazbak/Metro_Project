package com.khazbak.time;

public class DateTime {
    private int Minutes , Hours , Seconds ;

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int Minutes) {
        if(0>=Minutes){
            this.Minutes = Minutes;}
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        if(0>=Hours){
            this.Hours = Hours;}
    }

    public int getSeconds() {
        return Seconds;
    }

    public void setSeconds(int Seconds) {
        if(0>=Seconds){
            this.Seconds = Seconds;}
    }

}