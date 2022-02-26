package com.khazbak.station;

import java.util.Scanner;

public class InputAccepter {
    public static StationOutput getStartAndEndDestination(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter start");
        String firstDestination = scan.next();
        scan.nextLine();
        System.out.println("Enter end");
        String lastDestination = scan.next();

        StationOutput output=new StationOutput(firstDestination,lastDestination);
    return output;
    }
}
