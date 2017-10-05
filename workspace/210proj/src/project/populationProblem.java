package project;
import java.util.Scanner;


public class populationProblem {

	public static void main(String[] args) {
		double population = 1000;
		double r = 0.05;
		
		int i = 1;
		double new_population = population;
		while (new_population < 2000) {
			new_population = new_population + new_population*r;
			i++;
		}
		System.out.println(i-1);
	}
}
