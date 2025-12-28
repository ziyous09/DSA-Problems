package arrays;
import java.util.*;
public class FirstMissingPos {

    public static void main(String [] args){
        int [] arr = {4,2,-1,3,6,5};

        System.out.println(missingPos(arr));
    }
    static int missingPos(int [] arr){
        int n = arr.length;
        int i =0;

        while(i<n){
            int element = arr[i];
            if(element > 0 && element <=n){
                int correctInd = element -1;
                if(element != arr[correctInd]){
                    int temp = arr[correctInd];
                    arr[correctInd]=arr[i];
                    arr[i]=temp;
               }
                else{
                    i++;
                }
            }
            else {
                i++;
            }
        }
        for(int ind = 0 ;ind <n;ind ++){
            if(arr[ind]!=ind+1){
                return ind +1;
            }
        }
        return n+1;
    }
}
