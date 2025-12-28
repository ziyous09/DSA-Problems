package recursion.strings;
import java.util.*;
public class Permutation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        permutation("",s);
        //System.out.println(permutationList("",s));
        //System.out.println(countPermutation("",s));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int size = p.length();
        char ch = up.charAt(0);
        for(int i = 0;i<=size;i++){
            String f = p.substring(0,i);
            String s = p.substring(i,size);
            permutation(f+ch+s,up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutationList(f+ch+s,up.substring(1)));
        }
        return ans;
    }
    static int countPermutation(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0 ;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = count +  countPermutation(f+ch+s,up.substring(1));
        }
        return count;
    }
}
