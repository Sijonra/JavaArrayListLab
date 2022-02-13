package com.list.lab;

public class ArrayList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 2;

    public ArrayList(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity <= 0");
        }
        else list = (T[]) new Object[capacity];
    }

    public ArrayList(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void add(T element){
        if(size == list.length){
            T[] tmp = list;
            list = (T[]) new Object[size+2];
            for(int i = 0; i < tmp.length; i++){
                list[i] = tmp[i];
            }
            list[size++] = element;
        }
        else{
            list[size++] = element;
        }

    }

    public void add(int index, T element){
        for (int i = size; i > index; i--){
            list[i] = list[i-1];
        }
        list[index] = element;
        size++;
    }

    public void deleteByIndex(int index){
        for (int i = index; i < size; i++){
            list[i] = list[i+1];
        }
    }

    public void deleteByValue(T element){
        int pos = index(element);
        if(pos < 0){
            return;
        }
        deleteByIndex(pos);
    }

    public void display(){
        for (int i = 0; i < list.length-1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println();
    }

    public int index(T element){
        if (element == null) return -1;
        for(int i = 0; i < size; i++){
            if(element.equals(list[i])) return i;
        }
        return -1;
    }

    public T get(int index){
        if(index <= DEFAULT_CAPACITY){
            return  list[index];
        }
        else return null;
    }

    public void set(int index, T item) {
        list[index] = item;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else return false;
    }

    public boolean isFull(){
        if(size+1 == list.length){
            return true;
        }
        else return false;
    }

}