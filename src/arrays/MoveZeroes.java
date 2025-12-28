package arrays;
import java.util.*;
public class MoveZeroes {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of arrays: ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZero(int [] arr){
        int i = 0;
        for(int j =0;j<arr.length;j++){
            if(arr[j]!=0){
                swap(arr,i,j);
                i++;
            }
        }
    }

    static void swap(int[]arr,int i ,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
