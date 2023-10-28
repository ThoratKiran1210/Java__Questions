package Assignment;

public class SortUnsortArr {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Unsorted Array:");
        printArray(arr);
        
        mergeSort(arr);
        
        System.out.println("\nSorted Array:");
        printArray(arr);
    }
    
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return; // Base case: if the array has one or zero elements, it's already sorted.
        }
        
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }
        
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
    
    public static void merge(int[] arr, int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < nL) {
            arr[k++] = left[i++];
        }
        
        while (j < nR) {
            arr[k++] = right[j++];
        }
    }
    
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
