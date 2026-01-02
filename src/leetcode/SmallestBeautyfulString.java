package leetcode;
import java.util.*;
//https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/description/


public class SmallestBeautyfulString {
    public static void main(String [] args){
        String s = "100110011";
        System.out.println(beautyfulString(s,3));
    }
    public static String beautyfulString(String s,int k){
        int n = s.length();
        int len = Integer.MAX_VALUE;
        int count = 0;
        String ans = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            StringBuilder s2 = new StringBuilder();
            for(int j =i;j<n;j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
                if(count<=k){
                    s2.append(s.charAt(j));
                }
                if(count == k){
                    list.add(s2.toString());
                    len = Math.min(s2.length(),len);
                }
            }
            count=0;
        }
        Collections.sort(list);
        for(String str : list){
            if(str.length()==len){
                ans+=str;
                break;
            }
        }
        return ans;
    }
}
