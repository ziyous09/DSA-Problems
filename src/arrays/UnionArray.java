package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnionArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of arrays: ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the elements of arrays second: ");
        for(int i = 0;i<size1;i++) {
            arr1[i] = sc.nextInt();
        }
        List<Integer> ans = union(arr,arr1);
        System.out.println(ans);
    }
    static List<Integer> union (int[]arr, int[]arr1){
        int n = arr.length;
        int m = arr1.length;
        int i =0;
        int j =0;
        List<Integer>ans = new ArrayList<>();
        while(i<n && j<m){
            if(arr[i]<arr1[j]){
                if(ans.isEmpty()|| ans.get(ans.size()-1)!=arr[i]){
                    ans.add(arr[i]);
                }
                i++;
            }
            else if(arr[i]>arr[j]){
                if(ans.isEmpty()||ans.get(ans.size()-1)!=arr1[j]){
                    ans.add(arr1[j]);
                }
                j++;
            }
            else{
                if (ans.isEmpty()||ans.get(ans.size()-1)!=arr[i]){
                    ans.add(arr[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(ans.isEmpty()||ans.get(ans.size()-1)!=arr[i]){
                ans.add(arr[i]);
            }
            i++;
        }
        while(j<m){
            if(ans.isEmpty()||ans.get(ans.size()-1)!=arr1[j]){
                ans.add(arr1[j]);
            }
            j++;
        }
        return ans;
    }
}
