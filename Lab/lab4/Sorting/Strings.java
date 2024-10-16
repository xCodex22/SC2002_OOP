package Lab.lab4.Sorting;

import java.util.Scanner;

public class Strings {
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
    // 2. Change Array type from Integer[] to String[]
	String[] stringList; // 2
	int size;
	Scanner scan = new Scanner(System.in);
    // Part 3. sorting an array of String Objects
	System.out.print ("\nHow many String Objects do you want to sort? ");
	size = scan.nextInt();
    scan.nextLine(); // absorb \n

	stringList = new String[size]; // 2
	System.out.println ("\nEnter the Strings...");
	for (int i = 0; i < size; i++) {
        stringList[i] = scan.next(); // Autoboxing to String object
    }
	Sorting.selectionSort(stringList);
	System.out.println ("\nYour Strings in sorted order...");

	for (int i = 0; i < size; i++) {
        System.out.print(stringList[i] + " ");
    }
	System.out.println ();
    scan.close(); // close scan
	}
}
