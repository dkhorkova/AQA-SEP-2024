package org.prog.homework;


public class HomeworkMain {

    public static void main(String[] args) {
        String destination = "Milan";
        String startAirport = "Odessa";
        String transitAirport = "Stanbul";
        String nameOfCompany = "Luftansa";
        int flightNumber = 650;


        flyTo(destination, startAirport, transitAirport);


    }
    public static void flyTo ( String destination, String startAirport, String transitAirport) {
   }
   public static void flyTo ( String destination, String startAirport, String transitAirport, String nameOfCompany,
                              int flightNumber){
        System.out.println ( " Flight " + flightNumber + "of" + nameOfCompany + " from " + startAirport + " to " +
                destination + " through " + transitAirport);
   }
}






