package com.khazbak.station;

public class Station {

    private int id;
    private String name;
    private int[] lines;

    public Station(int id, String name, int[] lines) {
        this.id = id;
        this.name = name;
        this.lines = lines;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getLines() {
        return lines;
    }
}
