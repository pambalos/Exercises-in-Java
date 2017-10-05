package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Ass8 {
	public static void noFile() throws Exception {
		// LinkedList<Double> list = new LinkedList<Double>();
		// Double n = list.get(3);
		// Double a = list.getFirst();
		File file = new File(".../nothing");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		System.out.println("After handling");

	}

	public static void superException() throws Exception {
		LinkedList<Double> list = new LinkedList<Double>();
		Double n = list.get(3);
	}

	public static void main(String[] args) {
		try {
			noFile();
			System.out.println("Right After NoFile");
		} catch (FileNotFoundException ex) {
			System.out.println("FileNotFoundException caught");
		} catch (IOException ex) {
			System.out.println("IOException caught");
		} catch (Exception ex) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally run");
			try {
				superException();
				System.out.println("Right After SuperException");
			} catch (Exception inception) {
				System.out.println("INCEPTION!! Exception inside an Exception");
			} finally {
				System.out.println("Inception's Finally");
			}
			System.out.println("Finally Complete");
		}
	}
}