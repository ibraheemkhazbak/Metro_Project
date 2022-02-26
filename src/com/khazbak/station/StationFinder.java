package com.khazbak.station;

import java.util.ArrayList;
import java.util.List;

public class StationFinder {



    public static int findOnLine(String station){
        int line = 0;
        for (int i = 0; i < Stations.lines.length; i++) {
            for (int j = 0; j < Stations.lines[i].length; j++) {
                if(station.equalsIgnoreCase(Stations.lines[i][j])){
                    line=i+1;
                }
            }
        }
        return line;
    }
    public static int findIndex(String station,int line){
        line--;
        for (int i = 0; i < Stations.lines[line].length; i++) {
         if(station.equalsIgnoreCase(Stations.lines[line][i])){
             return i;
         }
        }
        return -1;
    }

}
