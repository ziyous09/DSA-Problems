package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of arrays: ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        rotateOne(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateOne(int []arr){
        int first = arr [0];
        for(int i =0 ;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }
}
