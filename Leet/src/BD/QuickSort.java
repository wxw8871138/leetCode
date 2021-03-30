package BD;

public class QuickSort {
    private int[] numbers;
    private int number;

    public void sort(int[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        this.numbers = values;
        number = values.length;
        quickSort(0, number - 1);
    }

    private void quickSort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low+(high-low)/2];
        while (i<=j){
            while (numbers[i]<pivot){
                i++;
            }
        }
    }
}
