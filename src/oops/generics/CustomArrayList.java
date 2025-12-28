package oops.generics;

import java.util.*;

public class CustomArrayList {
    private int [] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add( int num){
        if(isFull()){
            resize();
        }
        data[size++] = num ;
    }

    public int remove(){
        return data[--size];
    }

    public void set(int index , int value){
        data[index] = value;
    }
    public int get(int index){
        return this.data[index];
    }

    public int size(){
        return this.size;
    }

    private boolean isFull(){
        return this.size == data.length;
    }
    private void resize(){
        int [] temp = new int[data.length*2];
        for(int i =0 ;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList is " + Arrays.toString(Arrays.copyOf(data, size)) + " Size is " + size;
        }
}
