interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

public class SortingExample {
    public static void main(String[] args) {
        int[] arrayToSort = {5, 2, 8, 1, 3};

        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayToSort.clone());
        System.out.println("BubbleSort: " + java.util.Arrays.toString(arrayToSort));
        
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arrayToSort.clone());
        System.out.println("SelectionSort: " + java.util.Arrays.toString(arrayToSort));
    }
}
