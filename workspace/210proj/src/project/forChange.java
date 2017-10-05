package project;

import java.util.Scanner;
import java.math.*;

public class forChange {

	public static void main(String[] args) {
		int n = 15;
		int max = 0;
		int sum = 0;
		while (sum<n){
			sum = sum + max;
			max++;
		}
		System.out.println("Max: " +max + "\nSum: "+sum);
	}

	public static double dist(double x1, double y1, double x2, double y2) {
		double x;
		double y;
		x = Math.abs(x2 - x1);
		y = Math.abs(y2 - y1);
		System.out.println(x);
		System.out.println(y);
		System.out.println((y * y) + " : " + (x * x));
		double dist = Math.sqrt((y * y) + (x * x));
		return dist;
	}

	public static double rectArea(double x1, double y1, double x2, double y2, double x3, double y3, double x4,
			double y4) {

		double l = x2 - x1;
		double w = y1 - y3;

		return l * w;
	}
	
	public static double cylArea (double r, double h) {
		return Math.PI*(r*r)*h;
	}
	
	public static int calc (int n) {
		int max = 0;
		int sum = 0;
		while (sum<=n){
			sum = sum + max;
			max++;
		}
		return max;
	}
}
