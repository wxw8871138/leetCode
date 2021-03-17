package Numeric;

public class Q7 {
    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int remainder = x % 10;
            int last = res;
            res = res * 10 + remainder;
            if(last!=res/10){
                return 0;
            }
            x = x / 10;
        }
        return res;
    }
}
