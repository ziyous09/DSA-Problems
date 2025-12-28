package oops.generics;
import java.util.*;
public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T t){
        if(isFull()){
            resize();
        }
        data[size++] = t;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void resize(){
        Object [] temp = new Object[data.length*2];
        for(int i =0 ; i< data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove(){
        return (T)data[--size];
    }
    public void set(int index, T t){
        data[index] = t;
    }
    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList {" +
                " data = " + Arrays.toString(data) +
                ", size = " + size +
                '}';
    }
}
