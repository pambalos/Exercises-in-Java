package project;

import java.util.ArrayList;
import java.util.Random;
import java.math.*;

public class Ass9 {

	public static void main(String[] args) {	
		MyLinkedList list = new MyLinkedList();
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		list.add(5.0);
		list.add(6.0);
		System.out.println(list.toString());
		list.delete(2);
		System.out.println(list.toString());
		list.delete(3);
		System.out.println(list.toString());
		System.out.println(list.contains(1.0));
		System.out.println(list.contains(52.0));
		list.delete(4);
	}
//	
//	public static ArrayList<Double> delete(int i) {
//		
//	}
	
	public static ArrayList<Double> creation() {
		ArrayList<Double> newOne = new ArrayList<Double>();		
		for (int x = 0; x < 10; x++) {
			Random rand = new Random();
			double y = rand.nextDouble()*100;
			newOne.add(y);
		}
		
		System.out.println(newOne);
		return newOne;
	}
	
	public static ArrayList<Double> make() {
		ArrayList<Double> list = new ArrayList<Double>();
		list.add(10.0);
		list.add(12.0);
		list.add(5.0);
		list.add(2.5);
		list.add(15.0);
		list.add(22.0);
		list.add(8.5);
		list.add(19.0);
		list.add(1.5);
		list.add(0.1);
		
		return list;
	}
}
