package org.prog.equals;

import org.prog.inheritance.DemoCar;

public class HashEqualsDemo {

    /*
    ####################################
    ####################################
    #########car1#######################
    ####################################
    ####################################
    ################car2################
    ##########1#########################
     */

    public static void main(String[] args) {
        DemoCar demoCar1 = new DemoCar("a");
        DemoCar joshDemoCar = demoCar1;
        DemoCar demoCar2 = new DemoCar("a");

        demoCar1.color = "red";
        demoCar2.color = "red";


        System.out.println(demoCar1.equals(demoCar2));
        System.out.println(demoCar1 == demoCar2);
        System.out.println(demoCar1 == joshDemoCar);
    }
}
