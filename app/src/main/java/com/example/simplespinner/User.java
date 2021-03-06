package com.example.simplespinner;

import java.util.ArrayList;

public class User {

    private static ArrayList<User> userArrayList = new ArrayList<>();
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void initUser(){
        User user1 = new User("0", "1");
        userArrayList.add(user1);

        User user2 = new User("1", "2");
        userArrayList.add(user2);

        User user3 = new User("2", "3");
        userArrayList.add(user3);

        User user4 = new User("3", "4");
        userArrayList.add(user4);

        User user5 = new User("4", "5");
        userArrayList.add(user5);

        User user6 = new User("5", "6");
        userArrayList.add(user6);
    }

    public int getImage(){
        switch (getId()){
            case "0":
                return R.drawable.usericon0;
            case "1":
                return R.drawable.usericon1;
            case "2":
                return R.drawable.usericon2;
            case "3":
                return R.drawable.usericon3;
            case "4":
                return R.drawable.usericon4;
            case "5":
                return R.drawable.usericon5;

        }
        return R.drawable.usericon0;
    }
    public static ArrayList<User> getUserArrayList() {
        return userArrayList;
    }
}
