package oops.generics;
import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunctions {
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
//        arr.forEach((items)-> System.out.print(2*items+" "));
//        Consumer<Integer> fun = (items)->System.out.print(items*2+" ");
//        arr.forEach(fun);
        Operation sum = (a,b)-> a + b;
        Operation sub = (a,b)-> b - a;
        Operation mul = (a,b)-> a * b;
        Operation div = (a,b)-> a / b;

        LamdaFunctions myOperation = new LamdaFunctions();
        System.out.println(myOperation.operate(5,6,sum));
        System.out.println(myOperation.operate(5,6,sub));
        System.out.println(myOperation.operate(5,6,mul));
        System.out.println(myOperation.operate(5,6,div));
    }
    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }
}
interface Operation{
    int operation(int a,int b);
}
