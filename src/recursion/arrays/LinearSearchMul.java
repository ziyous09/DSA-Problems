package recursion.arrays;
import java.util.*;
public class LinearSearchMul {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elementst of arr");
        for(int i =0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
//        linearSearchMul(arr,target,0,list);
        list =linearSearchMul2(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> linearSearchMul(int [] arr ,int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return linearSearchMul(arr,target,index+1,list);
    }
    static ArrayList<Integer> linearSearchMul2(int [] arr ,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> callFromBelow =  linearSearchMul2(arr,target,index+1);
        list.addAll(callFromBelow);
        return list;
    }
}
