package oops;

public class DecimalToHexa {
    public static String toHexadecimal(int num){
        if(num<0){
            return "Negative Number";
        }
        if(num == 0){
            return "0";
        }

        StringBuilder ans = new StringBuilder();
        char [] hexChar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num>0){
            int rem = num%16;
            ans.insert(0,hexChar[rem]);
            num/=16;
        }
        return ans.toString();
    }
}
