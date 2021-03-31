package BD;

public class MaxSum {
    public int maxsumofSubarray(int[] arr) {
        // write code here
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                res += arr[i];
            }
        }
        return res;
    }
}
