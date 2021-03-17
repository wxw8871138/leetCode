package fastSlowPointer;

public class Q202 {
    private int getNext(int n){
        int totalSum = 0;
        while(n>0){
            int d = n%10;
            n = n /10;
            totalSum += d * d;
        }
        return totalSum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while (fast!=1&&fast!=slow){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast==1;
    }
}
