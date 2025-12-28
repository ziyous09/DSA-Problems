package recursion.strings;

import java.util.Scanner;

public class SkipApple {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String s = sc.next();
//        System.out.println(skipApple(s));
        System.out.println(skipAppNotApple(s));
    }
    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else{
            return s.charAt(0)+skipApple(s.substring(1));
        }
    }
    static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0)+skipAppNotApple(s.substring(1));
        }
    }
}
