package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {-3, 1, 2, -2, 7};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
}
