package BD;

public class QuickSort {
    public void quickSort(int[] arr, int startIndex, int endIndex){
        if(startIndex < endIndex){
            int partition = partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, partition - 1);
            quickSort(arr, partition+1,endIndex);
        }
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot =arr[startIndex];
        int left = startIndex;
        int right = endIndex;
        while (left!=right){
            while(left<right&&arr[right]>pivot){
                right--;
            }
            while (left<right&&arr[left]<pivot){
                left++;
            }
            if(left<right){
                swap(arr,left, right);
            }
        }
        swap(arr,startIndex,left);
        return left;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}
