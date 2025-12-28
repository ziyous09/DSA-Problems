package recursion.sorting;
import java.util.*;
public class BubbleSort {
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
        bubbleSort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble sort : we check that the current element is large than the next element and if true then we swap both and
    //go so on till all the element get placed at correct index...
    static void bubbleSort(int [] arr, int i , int j){
        if(i==0){
            return;
        }
        if(i>j){
            if(arr[j]>arr[j+1]){
                int temp = arr [j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
            }
            bubbleSort(arr, i, j+1);
        }
        else{
            bubbleSort(arr,i-1,0);
        }
    }
}
