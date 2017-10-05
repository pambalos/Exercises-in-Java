package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.HashSet;

public class Ass6 {

	public static void main(String[] args) {
		File file = new File("/Users/B-rad/Documents/CS/210/valueList.txt");
		System.out.println(file);
		LinkedList<Double> list = readListFile(file);
		System.out.println(getSum(list));
		System.out.println(list);
		System.out.println(numUnique(list));
		details(list);
		MyPoint p1 = new MyPoint();
		System.out.println(p1);
		MyPoint p2 = new MyPoint(3.0,3.0);
		System.out.println(p2);
	}
	
	//QUESTION 3
	public static LinkedList<Double> readListFile(File file) {
		LinkedList<Double> list = new LinkedList<Double>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			while (reader.ready()) {
				String content = reader.readLine();
				content.trim();
				String[] parts = content.split(",");

				for (int i = 0; i < parts.length; i++) {
					double value = Double.parseDouble(parts[i]);
					list.add(value);
				}

			}
			reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	//QUESTION 4
	public static double getSum(LinkedList<Double> a) {
		Double sum = 0.0;
		for (Double value:a) {
			sum = sum + value;
		}
		return sum;
	}
	
	//QUESTION 5
	public static int numUnique(LinkedList<Double> a) {
		HashSet<Double> list = new HashSet<Double>();
		for (Double value:a) {
			list.add(value);
		}
		System.out.println(list);
		int num = 0;
		for (Double value:list) {
			num++;
		}
		return num;
 	}
	
	//QUESTION 6
	public static void details(LinkedList<Double>a){
		HashMap<Double, Integer> list = new HashMap<Double, Integer>();		
		for (Double value:a) {
			if (list.containsKey(value)) {
				int count = list.get(value).intValue();
				count = count + 1;
				list.put(value, count);
			} else {
				list.put(value, 1);
			}
		}
		System.out.println(list);
	}
}
