package org.prog.collections;

import org.prog.inheritance.DemoCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDemo {

    public static void main(String[] args) {
        //[start_of_list] - ["d"] - ["e"] - ["g"] - ["f"] - ["end_of_list"]
//        LinkedList<String> strings2 = new LinkedList<>();
//        strings2.add("d"); //3
//        strings2.add("e"); //4
//        strings2.add("f");//5
        //0 -> "a"
        //1 -> "b"
        //2 -> "c"
//        List<String> sList = new ArrayList<>();
//        sList.add("a");// 0
//        sList.add("a");// 0
//        sList.add("b");// 1
//        sList.add("c");// 2
//        System.out.println("sList size " + sList.size());
//
//        System.out.println(sList.get(1));
//        sList.addAll(strings2);
//
//        System.out.println(sList.indexOf("d"));
//        Object[] strings = sList.toArray();

//        System.out.println(sList.get(5));
//        sList.remove("a");
//        sList.removeAll(strings2);
//        sList.remove(1);
//        System.out.println(">>>> " + sList.get(0));
        carListDemo();
    }

    public static void carListDemo() {
        Random random = new Random();
        List<DemoCar> demoCars = new ArrayList<>();
        List<DemoCar> barelyUsedDemoCars = new ArrayList<>();
        List<DemoCar> heavilyUsedDemoCars = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            demoCars.add(new DemoCar("a"));
        }

        for (int i = 0; i < demoCars.size(); i++) {
            demoCars.get(i).color = "black";
            demoCars.get(i).milage = random.nextInt(100000);
            random.nextInt(3);
        }

        for (int i = 0; i < demoCars.size(); i++) {
            if (demoCars.get(i).milage > 50000) {
                heavilyUsedDemoCars.add(demoCars.get(i));
                System.out.println("Car index is " + i);
                System.out.println("A car with big milage! " + demoCars.get(i).milage);
            } else {
                barelyUsedDemoCars.add(demoCars.get(i));
            }
        }

        System.out.println("Used cars count: " + heavilyUsedDemoCars.size());
        System.out.println("Almost new cars count: " + barelyUsedDemoCars.size());
    }
}
