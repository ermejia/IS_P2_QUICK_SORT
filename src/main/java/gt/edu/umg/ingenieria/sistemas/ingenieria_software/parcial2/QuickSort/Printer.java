package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.QuickSort;

public class Printer {
    /**
     * Function to print an array
     * @param orderedArray
     */
    public void printArray(String orderedArray[])
    {
        int n = orderedArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(orderedArray[i] + " ");
        System.out.println();
    }
}
