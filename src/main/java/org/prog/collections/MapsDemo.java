package org.prog.collections;

import java.util.HashMap;
import java.util.Map;

//TODO: Create
public class MapsDemo {

    public static void main(String[] args) {
        Map<String, CarOwner> users = new HashMap<>();
//        Map<String, User> users2 = new HashMap<>();

        users.put("testUser1", getUser(1));
        users.put("testUser2", getUser(2));
        users.put("testUser3", getUser(3));
        users.put("testUser4", getUser(4));
        users.put("testUser5", getUser(5));

//        System.out.println(users.get("testUser5").firstName);
//        User u = users.remove("testUser2");
//        for (Map.Entry<String, User> e : users.entrySet()) {
//            System.out.println(e.getKey() + " : " + e.getValue().id);
//        }
//        users.replace("asd", new User());
//        System.out.println(users.size());

    }

    public static CarOwner getUser(int id) {
        CarOwner user = new CarOwner();
        user.lastName = "test";
        user.firstName = "test";
        user.phoneNumber = "test";
        return user;
    }
}
