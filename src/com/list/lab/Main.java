package com.list.lab;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zadnica Tohi0");
        list.add("zadnica Tohi1");
        list.add("zadnica Tohi2");
        list.add("zadnica Tohi3");
        list.display();
        list.deleteByIndex(0);
        list.display();
    }
}
