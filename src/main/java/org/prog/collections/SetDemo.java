package org.prog.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(strings.contains("c"));
        System.out.println(strings.contains("f"));


    }
}
