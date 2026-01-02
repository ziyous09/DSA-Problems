package leetcode;
import java.util.*;

//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
public class NthReapeatedElement {
    public static void main(String [] args){
        int [] arr = {123331};
        System.out.println(mostRepeated(arr));
    }
    public static int mostRepeated(int [] nums){
        for(int i = 2;i<nums.length;i++){
            if(nums[i]==nums[i-1]||nums[i]==nums[i-2]){
                return nums[i];
            }
        }
        return nums[0];
    }
}
