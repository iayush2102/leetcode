package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {-3, 1, 2, -2, 7};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
