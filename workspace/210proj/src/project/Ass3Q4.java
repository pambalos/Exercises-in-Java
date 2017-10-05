package project;
import java.util.ArrayList;
import java.util.Scanner;


public class Ass3Q4 {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1); 
		
		
//		int count = 1;
//		int sum = 0;
//		while(count<=n)
//		{
//			sum = count + sum;
//			System.out.println("Count = "+count+" | Sum = "+sum);
//
//			count+=2;
//		}
	}
	
	public static double enter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input one number: ");
		double input = scan.nextDouble();
		scan.close();
		return input;
	}
}
