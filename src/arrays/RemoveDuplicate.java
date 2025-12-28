package arrays;
import java.util.*;
public class RemoveDuplicate {
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int[] arr = new int[size];
       for(int i = 0;i<size;i++) {
           arr[i] = sc.nextInt();
       }

       removeDuplicate(arr);
       System.out.println(Arrays.toString(arr));
   }
   static void removeDuplicate(int []arr){
       int i =0;
       for(int j = 1;j<arr.length;j++){
           if(arr[i]!=arr[j]){
               i++;
               swap(arr,i,j);
           }
       }
   }
   static void swap(int[]arr,int i ,int j){
       int temp =arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   }
}
