package com.list.lab;

public class ArrayList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public ArrayList(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity <= 0");
        }
        else list = (T[]) new Object[capacity];
    }

    public ArrayList(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T item){
        // check for full List
        list[size++] = item;
    }

    public void add(int index, T element){
        for (int i = size; i > index; i--){
            list[i] = list[i-1];
        }
        list[index] = element;
        size++;
    }

    public void delete(int index){
        for (int i = index; i < size; i++){
            list[i] = list[i+1];
        }
    }

    public void display(){
        for (T elem: list) {
            System.out.println(elem + " ");
        }
    }

    public void alert(String str){
        System.out.println(str);
    }

}