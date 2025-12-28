package recursion.sorting;
import java.util.*;

public class MergeSort {
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
        int [] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int [] mergeSort(int [] arr){
       if(arr.length==1){
           return arr;
       }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int [] merge(int[]left,int[]right){
        int i = 0;
        int j = 0;
        int k = 0;
        int n = left.length;
        int m = right.length;
        int [] temp = new int [n+m];
        while(i<n && j <m){
            if(left[i]<right[j]){
                temp[k]=left[i];
                i++;
            }
            else{
                temp[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n){
            temp[k]=left[i];
            i++;
            k++;
        }
        while(j<m){
            temp[k]=right[j];
            j++;
            k++;
        }
        return temp;
    }
}
