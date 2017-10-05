package 210;

public class SecondTryAss9
{
	//	store the elements in an array
	private double[] elements;
	private int current;

	public MyArrayList(int initialCapacity)
	{
		this.elements = new double[initialCapacity];
		this.current = 0;
	}

	public MyArrayList()
	{
		this(4);
	}

	private void resizeIfNeedBe()
	{
		if (this.elements.length == this.current)
		{
			//	resize the array by making it one bigger
			double[] newElements = new double[this.elements.length * 2];
			//	copy the elements into the newElements
			for (int i = 0; i < this.elements.length; i++)
			{
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}

	public void addFront(double x)
	{
		resizeIfNeedBe();
		for (int i = current; i != 0; i--)
		{
			this.elements[i] = this.elements[i - 1];
		}
		this.elements[0] = x;
		this.current++;
	}

	public void add(double x)
	{
		resizeIfNeedBe();
		this.elements[this.current] = x;
		this.current++;
	}

	public double get(int i)
	{
		//	check that i is between 0 and size of the list - 1
		if (i < 0 || i >= size())
		{
			throw new IndexOutOfBoundsException("" + i);
		}
		return this.elements[i];
	}

	public int size()
	{
		return current;
	}

	public boolean isEmpty()
	{
		return size() == 0;
	}
}