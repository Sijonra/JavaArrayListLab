package com.list.lab;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 13; i++) list.add(i);
        list.display();
        list.deleteByIndex(0);
        list.display();
        System.out.println(list.getSize());
        System.out.println(list.isFull());
    }
}
