package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of arrays: ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k:");
        int k = sc.nextInt();
        System.out.println("Enter the direction:");
        String dir = sc.next();

        rotateArray(arr,k,dir);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArray(int [] arr,int k,String dir){
        int n = arr.length;
        if(dir.equals("left")){
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
            reverse(arr,0,n-1);
        }
        if(dir.equals("right")){
            reverse(arr,0,n-1);
            reverse(arr,0,k-1);
            reverse(arr,k,n-1);
        }
    }
    static void reverse(int [] arr,int s ,int e){
        while(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
