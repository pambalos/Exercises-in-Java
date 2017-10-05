package project;
import java.util.Scanner;


public class testTwo {

	public static void main(String[] args) {
		
		Scanner enter = new Scanner(System.in);
		System.out.print("Input a value for N: ");
		int N = enter.nextInt();
		enter.close();
		
		int count = 1;
		int sum = 0;
		while(count<N)
		{
			sum = count + sum;
			System.out.println("Count = "+count+" | Sum = "+sum);

			count+=2;
		}
	}
}
