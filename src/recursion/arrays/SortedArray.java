package recursion.arrays;
import java.util.*;
public class SortedArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of arrays");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int [] arr,int ind){
        if(ind == arr.length-1){
            return true;
        }
        return arr[ind]<arr[ind+1] && isSorted(arr,ind + 1);
    }
}
