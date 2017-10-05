package project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ass5
{
	public static void main(String[] args)
	{
		double[] x = { 3, 5, 2, -1, 0, 7, 4 };
		insertionSort(x);
		System.out.println(Arrays.toString(x));
	}

	//	swaps a[i] with a[j]
	public static void swap(double[] a, int i, int j)
	{
		double old_a_i = a[i];
		a[i] = a[j];
		a[j] = old_a_i;
	}

	//	start is the position of the start of the unsorted part
	public static int findMinPos(double[] a, int start)
	{
		int pos = start;
		for (int j = start + 1; j < a.length; j++)
		{
			if (a[j] < a[pos])
				pos = j;
		}

		return pos;
	}

	public static void selectionSort(double[] a)
	{
		//	i is the position of the start of the unsorted part
		for (int i = 0; i < a.length - 1; i++)
		{
			int minPos = findMinPos(a, i);
			//	swap a[pos] to the back of the sorted part
			swap(a, i, minPos);
		}

		assert isSorted(a);
	}

	public static void insertionSort(double[] a)
	{
		//	i is the position of the start of the unsorted part
		//	initially the sorted part is just a[0]
		for (int i = 1; i < a.length; i++)
		{
			//	moves a[j] to it's correct position in the sorted part
			int j = i;
			while (j > 0 && a[j] < a[j - 1])
			{
				swap(a, j, j - 1);
				j--;
			}
		}

		assert isSorted(a);
	}

	public static boolean isSorted(double[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			if (a[i] > a[i + 1])
			{
				return false;
			}
		}

		return true;
	}

}