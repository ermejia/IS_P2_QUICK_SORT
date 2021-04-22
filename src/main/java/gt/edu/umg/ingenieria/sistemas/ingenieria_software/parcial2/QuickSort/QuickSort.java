package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.QuickSort;

public class QuickSort {
    /**
     * This function takes last element as pivot, places
     *  the pivot element at its correct position in sorted
     *  array, and places all smaller (smaller than pivot)
     *  to left of pivot and all greater elements to right
     *  of pivot
     * @param orderArray
     * @param left
     * @param right
     * @return
     */
    private static int divition(String orderArray[], int left, int right) {
        String pivot = orderArray[left];
        while (true) {
            while (orderArray[left].compareTo(pivot) < 0) {
                left++;
            }
            while (orderArray[right].compareTo(pivot) > 0) {
                right--;
            }
            if (left >= right) {
                return right;
            } else {
                String tmp = orderArray[left];
                orderArray[left] = orderArray[right];
                orderArray[right] = tmp;
                left++;
                right--;
            }
        }
    }

    /**
     * left  --> Starting index,  right  --> Ending index
     * @param orderArray
     * @param left
     * @param right
     */
    public  void quicksort(String orderArray[], int left, int right) {
        if (left < right) {
            /* partition is partitioning index, orderArray[partition] is now
           at right place */
            int partition = divition(orderArray, left, right);
            quicksort(orderArray, left, partition);
            quicksort(orderArray, partition + 1, right);
        }
    }
}
