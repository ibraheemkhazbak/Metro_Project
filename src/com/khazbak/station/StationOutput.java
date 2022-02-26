package com.khazbak.station;

public class StationOutput {
    public String start;
    public String end;

    public StationOutput(String start, String end) {
        this.start = start;
        this.end = end;
    }




    @Override
    public String toString() {
        return start+ " " + end;
    }
}
