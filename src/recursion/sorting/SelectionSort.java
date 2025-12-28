package recursion.sorting;

import java.util.*;
public class SelectionSort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr, arr.length,0, 0);
        System.out.println(Arrays.toString(arr));
    }
    // Selection sort : we take the largest and put it at the last index,
    // second largest at second last and so on.
    static void selectionSort(int [] arr , int i , int j, int max){
        if( i == 0){
            return ;
        }
        if(i>j){
            if(arr[max]<arr[j]){
                selectionSort(arr,i,j+1,j);
            }
            else{
                selectionSort(arr,i,j+1,max);
            }
        }
        else{
            int temp = arr[i-1];
            arr[i-1]=arr[max];
            arr[max] = temp;
            selectionSort(arr,i-1,0,0);
        }
    }
}
