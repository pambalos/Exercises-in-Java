package project;
import java.util.Scanner;

public class interestProblem {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Input a principal value: ");
		
		int p = enter.nextInt();
		
		System.out.println("Input an interest rate as a decimal: ");
		double r = enter.nextDouble();
		
		int n = 10;
		int i = 0;
		
		double new_p = p;
		
		while (i<=n) {
			new_p = (p)*Math.pow((1+r), i);
			i++;
		}
		
		double third_p = (p)*Math.pow((1+r), n);
		
		double second_p = p;
		i = 1;
		
		while (i<=10) {
			second_p = second_p+second_p*(r);
			i++;
		}
		
		System.out.println("Principal is now " + new_p + " after " + n + " years");
		System.out.println("Second Principal is now " + second_p + " after " + n + " years");
		System.out.println("Third Principal is " + third_p + " after " + n + " years");

	}

}
