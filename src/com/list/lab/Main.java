package com.list.lab;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.add("zadnica Tohi0");
        list.add("zadnica Tohi1");
        list.add("zadnica Tohi2");
        list.add("zadnica Tohi3");
        list.add("zadnica Tohi4");
        list.add("zadnica Tohi5");
        list.add("zadnica Tohi6");
        list.add("zadnica Tohi7");
        list.add("zadnica Tohi8");
        list.add("zadnica Tohi9");
        list.add("zadnica Tohi10");
        list.add("zadnica Tohi11");
        list.add("zadnica Tohi12");
        list.add("zadnica Tohi13");
        list.display();
        System.out.println(list.getSize());
        System.out.println(list.isFull());
        list.deleteByIndex(0);
        list.display();
        System.out.println(list.isFull());
    }
}
