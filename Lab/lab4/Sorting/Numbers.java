package Lab.lab4.Sorting;

import java.util.Scanner;

public class Numbers {
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.
// --------------------------------------------
public static void main (String[] args)
{
    // 1. Change Array type from primitive int[] to Integer[]
	Integer[] intList; // 1
	int size;
	Scanner scan = new Scanner(System.in);
	System.out.print ("\nHow many integers do you want to sort? ");
	size = scan.nextInt();
	intList = new Integer[size]; // 1
	System.out.println ("\nEnter the numbers...");
	for (int i = 0; i < size; i++) {
        intList[i] = scan.nextInt(); // Autoboxing: int to Integer objects
    }

	Sorting.selectionSort(intList);
	System.out.println ("\nYour numbers in sorted order...");

	for (int i = 0; i < size; i++) {
        System.out.print(intList[i] + " ");
    }
		
	System.out.println ();
    scan.close(); // close scan
	}
}

// Part 1-2:
// With reference to Sorting.java which uses Comparable[], the int[]
// in Numbers.java is primitive and does not implement Comparable
// By changing from int[] to Integer[], it will allow Sorting class since
// it implements Comparable to work