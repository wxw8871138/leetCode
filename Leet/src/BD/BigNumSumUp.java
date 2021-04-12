package BD;

public class BigNumSumUp {
    public static String solve (String s, String t) {
        // write code here
        StringBuilder res = new StringBuilder();
        int i = s.length()-1;
        int j = t.length()-1;
        int carry = 0;
        while (i>=0||j>=0){
            int n1 = i>=0?s.charAt(i)-'0':0;
            int n2 = j>=0?t.charAt(j)-'0':0;
            int sum = n1+n2+carry;
            carry = sum/10;
            res.append(sum%10);
            i--;
            j--;
        }
        if(carry==1){
            res.append(1);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        String test = "3322";
        System.out.println(solve("733064366","459309139"));
    }
}
