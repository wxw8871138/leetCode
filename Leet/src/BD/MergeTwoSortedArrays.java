package BD;

public class MergeTwoSortedArrays {
    public void merge(int A[], int m, int B[], int n) {
        if(m==0){
            return;
        }
        int pA = 0;
        int pB = 0;
        int res[] = new int[m];
        int i = 0;
        while(pB<=n){
            if(A[pA]<=B[pB]){
                res[i] = A[pA];
            }else {
                res[i] = B[pB];
            }
            i++;
        }
        for (int j = 0; j < m; j++) {
            A[i] = res[i];
        }
    }
}
