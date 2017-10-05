package project;
import java.util.Arrays;
import java.util.Scanner;

public class notes {

	public static void main(String[] args) {
		double[] testArray = {1,3,5};
		double result = sum(testArray);
		System.out.println(result);
		int n = 5;
		double v = 10;
		Arrays.toString(fill(n,v));
		System.out.println(Arrays.toString(random(n)));
		System.out.println(min(testArray));
		System.out.println(max(testArray));
		}
	
	public static double sum(double[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	public static double[] fill(int n, double v) {
		double[] resArray = new double[n];
		for (int i = 0; i < n ; i++) {
			resArray[i] = v;
		}
		return resArray;
	}
	
	public static double[] random (int n) {
		double[] array = new double [n];
		for (int i = 0; i<n ; i++ ) {
			array[i] = Math.random()*100;
		}
		return array;
	}	
	
	public static double min (double[]a){
		double min = a[0];
		for (int i = 0 ; i < a.length ; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static double max (double[] a) {
		double max = a[0];
		for (int i = 0 ; i < a.length ; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}





