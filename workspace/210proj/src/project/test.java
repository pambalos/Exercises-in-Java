package project;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Input one number: ");
		
		int n = enter.nextInt();
		enter.close();
		
		int count = 1;
		int sum = 0;
		while(count<=n)
		{
			sum = count + sum;
			System.out.println("Count = "+count+" | Sum = "+sum);

			count+=2;
		}
	}
}
