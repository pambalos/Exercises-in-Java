package project;

public class MyArrayList {
	// store the elements in an array
	private double[] elements;
	private int current;
	
	public String toString() {
		String string = "[";
		for (int n = 0; n < elements.length; n ++) {
			if (n == elements.length - 1) {
				string = string + elements[n] + "]";
			}
			else {
			string = string + elements[n] + ", ";
			}
		}
		return string;
	}

	public MyArrayList(int initialCapacity) {
		this.elements = new double[initialCapacity];
		this.current = 0;
	}

	public void delete(int n) {
		if (n > elements.length) {
			System.out.println("MyArrayList does not contain a " + n+ " element" );
		}
		else {
			double[] temp = new double[elements.length-1];
			for (int x = 0; x < n ; x++) {
				temp[x] = elements[x];
			}
			for (int a = n; a<elements.length -1; a++){
				temp[a] = elements [a+1];
			}
			this.elements = temp;
		}
	}
	
	public boolean contains(double num) {
		boolean check = false;
		for (double n: elements) {
			if (n == num) {
				check = true;
			}
		}
		return check;
	}

	public MyArrayList() {
		this(4);
	}

	private void resizeIfNeedBe() {
		if (this.elements.length == this.current) {
			// resize the array by making it one bigger
			double[] newElements = new double[this.elements.length * 2];
			// copy the elements into the newElements
			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}

	public void addFront(double x) {
		resizeIfNeedBe();
		for (int i = current; i != 0; i--) {
			this.elements[i] = this.elements[i - 1];
		}
		this.elements[0] = x;
		this.current++;
	}

	public void add(double x) {
		resizeIfNeedBe();
		this.elements[this.current] = x;
		this.current++;
	}
}