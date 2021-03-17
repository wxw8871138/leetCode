package Numeric;

public class Q9 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = Integer.toString(x);
        String reverse = new StringBuilder(s).reverse().toString();
        if(s.equals(reverse)){
            return true;
        }
        return false;
    }
}
