package project;
import java.util.Scanner;

public class secondTest {

	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		int[] b = a;
		int[] c = {10,20,30,40};
		System.out.println(a == b);
		System.out.println(a == c);
	}
}
