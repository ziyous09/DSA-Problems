package recursion.strings;

import java.util.Stack;

public class ValidateParenthesis {
    public static void main(String [] args){
        String s = "(({[)]}))";
        System.out.println(isValidate(s));
    }
//    static boolean isValidate(String s){
//        Stack<Character> str = new Stack<>();
//        for(char ch : s.toCharArray()){
//            if(ch=='('||ch=='{'||ch=='['){
//                str.push(ch);
//            } else if (str.isEmpty()) {
//                return false;
//            }
//            else{
//                if(str.peek()=='('&&ch==')'||str.peek()=='['&&ch==']'||str.peek()=='{'&&ch=='}'){
//                    str.pop();
//                }
//                else {
//                    return false;
//                }
//            }
//        }
//        if(str.size()>=1){
//            return false;
//        }
//        return true;
//    }
    static boolean isValidate(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                stack.push(')');
            }else if(ch=='{'){
                stack.push('}');
            }else if(ch=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.pop()!=ch){
                    return false;
                }
            }
        }
        return true;
    }


}
