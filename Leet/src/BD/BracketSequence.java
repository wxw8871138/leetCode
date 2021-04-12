package BD;

import java.util.Stack;

public class BracketSequence {
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['||stack.isEmpty()){
                stack.push(c);
            }
            if(c==')') {
                if (stack.peek()=='('){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
            if(c=='}') {
                if (stack.peek()=='{'){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
            if(c==']') {
                if (stack.peek()=='['){
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }
}
