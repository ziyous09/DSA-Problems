package oops.generics;
import java.util.*;
import java.util.ArrayList;

public class Main implements GenericInterface<Integer>{
    public static void main(String [] args){
        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        list.add("Kunal Maurya");
        list.add("Brijesh Singh");
        list.add("Awadhesh Rai");
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> str1 = new ArrayList<>();
        str.add("Kunal Maurya");
        str1.add("Awadesh Rai");

        System.out.println(list);
    }

    @Override
    public void display(Integer value) {

    }
}
