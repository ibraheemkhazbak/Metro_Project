package com.khazbak;

import com.khazbak.station.InputAccepter;
import com.khazbak.station.StationFinder;
import com.khazbak.station.StationOutput;
import com.khazbak.station.Stations;

public class Main {

    public static void main(String[] args) throws Exception {
        StationOutput output= InputAccepter.getStartAndEndDestination();
        int startLine= StationFinder.findOnLine(output.start);
        int endLine= StationFinder.findOnLine(output.end);

        int startIndex=StationFinder.findIndex(output.start,startLine);
        int endIndex=StationFinder.findIndex(output.end,endLine);
        int distance=0;
        if(startLine==endLine){
            System.out.println(Math.abs(startIndex-endIndex));
         }else{
            int linkedIndexAtLine1=-1;
            int linkedIndexAtLine2=-1;
              linkedIndexAtLine1=StationFinder.findIndex(Stations.linkedLines[0],startLine);
                    linkedIndexAtLine2=StationFinder.findIndex(Stations.linkedLines[0],endLine);

                if(linkedIndexAtLine1==-1||linkedIndexAtLine2==-1){
                    throw new Exception("no linked station exists");
                }
                distance+=Math.abs(startIndex-linkedIndexAtLine1);
            System.out.println(distance);
                distance+=Math.abs(endIndex-linkedIndexAtLine2);
            System.out.println(distance);


        }
        convertSecondsToTime(distance*200);
        System.out.println(distance);
    }
    public static void convertSecondsToTime(int time){

        int carry=time%3600;

        int Hours =time/3600;
        int Minuts =carry/60;
        int Second =time%60;

        System.out.println("Hours  = "+Hours);

        System.out.println("Minutes ="+Minuts);

        System.out.println("Seconds ="+Second);
    }

}
