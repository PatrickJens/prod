import Sorts.*;
import Utilities.*;

public class main
{
	public static void main(String args[])
	{
		System.out.println("main");
		ArrayManager am = new ArrayManager();
		int[] A = {7,2,4,5,10,13,1,5,9,3};		//output is 1 2 3 4 5 5 7 9 10 13
		



		/* MergeSort */
		MergeSort ms = new MergeSort();
		int[] B = ms.sort(A);
		am.printIntArray(B);
		
		/* MergeSort
		MergeSort ms = new MergeSort();
		ms.sort(A, A.length);
		am.printIntArray(A);
		*/
		/* InsertionSort
		InsertionSort is = new InsertionSort();
		is.sort(A);
		am.printIntArray(A);
		*/
		
		/* BubbleSort
		BubbleSort bs = new BubbleSort();
		bs.sort(A);
		am.printIntArray(A);
		*/

		/* SelectionSort 
		SelectionSort ss = new SelectionSort();
		ss.sort(A);
		am.printIntArray(A);
		*/

	}	
}