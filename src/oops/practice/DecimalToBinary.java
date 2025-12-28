package oops;

public class DecimalToBinary {
    public static String binaryConvert(int num){
        StringBuilder ans = new StringBuilder();
        while(num!=0){
            int rem = num%2;
            ans.insert(0,rem);
            num = num/2;
        }
        return ans.toString();
    };
}
