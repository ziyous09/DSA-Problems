package leetcode;

// 520 https://leetcode.com/problems/detect-capital/description/
public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Google"));
    }

    static public boolean detectCapitalUse(String s) {
        if(s.length()<2){
            return true;
        }
        boolean allUpper = s.charAt(0)<='Z' && s.charAt(1)<='Z';
        for(int i = 1;i<s.length();i++){
            if(allUpper){
                if(s.charAt(i)>'Z') return false;
            }
            else{
                if(s.charAt(i)<'a') return false;
            }
        }
        return true;
    }
}
