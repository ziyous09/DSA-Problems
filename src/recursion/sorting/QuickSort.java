package recursion.sorting;

import java.util.*;

public class QuickSort {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr , int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s+(e-s)/2;
        int pivoit = arr[mid];
        while(s<=e){
            while(arr[s]<pivoit){
                s++;
            }
            while(arr[e]>pivoit){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,high);
    }
}
