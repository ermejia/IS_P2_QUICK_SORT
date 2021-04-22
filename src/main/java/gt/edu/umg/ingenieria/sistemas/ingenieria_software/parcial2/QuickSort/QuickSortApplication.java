package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.QuickSort;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class QuickSortApplication {
	/**
	 * Driver Code
	 * @param args
	 */
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		Printer print = new Printer();

		Scanner arrayInput=new Scanner(System.in);
		System.out.print("Enter the number of words to order:");
		int n=arrayInput.nextInt();
		String[] orderedArray=new String[n];

		for(int i=0;i<n;i++){
			System.out.print("Word "+(i+1)+": ");
			orderedArray[i]=arrayInput.next();
		}

		System.out.println("The words in order are: ");
		quickSort.quicksort(orderedArray, 0, orderedArray.length - 1);
		print.printArray(orderedArray);
	}

}
