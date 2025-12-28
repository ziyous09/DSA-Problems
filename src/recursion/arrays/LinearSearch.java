package recursion.arrays;
import java.util.*;
public class LinearSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of array");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr,target,0));
    }
    static int linearSearch(int [] arr, int target, int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr,target,index+1);
    }
}
