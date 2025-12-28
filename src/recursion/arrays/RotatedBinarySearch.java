package recursion.arrays;
import java.util.*;
public class RotatedBinarySearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the element of arrays");
        for(int i =0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println(rotateBinarySearch(arr,target,0,arr.length-1));
    }
//    static int rotateBinarySearch(int [] arr, int target , int s, int e){
//        if(s>e){
//            return -1;
//        }
//        int mid = s+(e-s)/2;
//        if(target == arr[mid]){
//            return mid;
//        }
//        if(arr[s]<=arr[e]){
//            if(target>=arr[s]&&target<=arr[mid]){
//                return rotateBinarySearch(arr,target,s,mid-1);
//            }
//            else{
//                return rotateBinarySearch(arr,target,mid+1,e);
//            }
//        }
//        if(target>=mid && target<=e){
//            return rotateBinarySearch(arr, target, mid+1,e);
//        }
//        return rotateBinarySearch(arr,target,s,mid-1);
//    }
    static int rotateBinarySearch(int [] arr,int target,int s,int e){
        if(arr==null || arr.length==0){
            return -1;
        }
        int mid = s +(e - s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<arr[e]){
            if(target>=arr[s] && target< arr[mid]){
                return rotateBinarySearch(arr,target,s,mid-1);
            }
            else{
                return rotateBinarySearch(arr,target,mid+1,e);
            }
        }
        else{
            if(target>arr[mid] && target <=arr[e]){
                return rotateBinarySearch(arr,target,mid+1,e);
            }
            else{
                return rotateBinarySearch(arr,target,s,mid-1);
            }
        }
    }
}
