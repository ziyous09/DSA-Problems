package recursion.strings;
import java.util.*;
public class RemoveA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = sc.next();
//        removeA(s,"");
        System.out.println(skipA(s));

    }
    static void removeA(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            removeA(up.substring(1),p);
        }
        else{
            removeA(up.substring(1),p+ch);
        }
    }
    static String skipA(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch=='a'){
            return skipA(s.substring(1));
        }
        else{
            return ch+skipA(s.substring(1));
        }
    }


}
