package Lab.lab4.Sorting;

public class Sorting
{
	//-----------------------------------------------------------------
	// Sorts the specified array of objects using the selection
	// sort algorithm.
	//-----------------------------------------------------------------
    // Ascending Mode
	public static void selectionSort (Comparable[] list)
	{
		int min;
		Comparable temp;
		for (int index = 0; index < list.length-1; index++)
		{
			min = index;
			for (int scan = index+1; scan < list.length; scan++)
				if (list[scan].compareTo(list[min]) < 0)
					min = scan;
			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	//-----------------------------------------------------------------
	// Sorts the specified array of objects using the insertion
	// sort algorithm.
	//-----------------------------------------------------------------
    // 4. Modify the insertionSort algorithm so that it sorts in
    // descending order rather than ascending order
    //-----------------------------------------------------------------
	public static void insertionSort(Comparable[] list)
	{
		for (int index = 1; index < list.length; index++)
		{
			Comparable key = list[index];
			int position = index;
            // Descending Mode
			// Shift smaller values to the right to push larger values to the left
			while (position > 0 && key.compareTo(list[position-1]) > 0)
			{
				list[position] = list[position-1];
				position--;
			}
				list[position] = key;
		}
	}
}

// Note:
// Comparable method of compareTo:
// 0 : equal
// > 0; greater to parameter
// < 0; smaller to parameter
