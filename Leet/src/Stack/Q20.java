package Stack;

import java.util.ArrayList;
import java.util.List;

public class Q20 {
    public static boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(stack.size()==0){
                stack.add(s.charAt(i));
                continue;
            }
            if(s.charAt(i)==')'&&stack.get(stack.size()-1)=='('||s.charAt(i)=='}'&&stack.get(stack.size()-1)=='{'||s.charAt(i)==']'&&stack.get(stack.size()-1)=='['){
                stack.remove(stack.size()-1);
            }
            else {
                stack.add(s.charAt(i));
            }
        }
        if(stack.size()==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
    }
}
