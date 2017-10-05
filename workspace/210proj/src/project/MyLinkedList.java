package project;

public class MyLinkedList {
	private ListNode head;

	public MyLinkedList() {
		this.head = null;
	}

	public void delete(int i) {
		ListNode current = head;
		for (int j = 0; j < i - 1; j++) {
			current = current.next;
			if (current.next == null) {
				System.out.println("Will Terminate: There is no element " + i);
			}
		}
		if (current.next.next == null || current.next == null) {
			System.out.println("Will Terminate: There is no element " + i);
		}
		current.next = current.next.next;
	}

	public String toString() {
		String string = "[";
		ListNode pointer = head;
		while (pointer.next != null) {
			string = string + pointer.value + ", ";
			pointer = pointer.next;
		}
		string = string + pointer.value + "]";
		return string;
	}

	public boolean contains(double num) {
		boolean check = false;
		ListNode pointer = head;
		while (pointer.next != null) {
			if (pointer.value == num) {
				check = true;
			}
			if (pointer.value == num) {
				check = true;
			}
			pointer = pointer.next;
		}
		return check;
	}

	public void add(double x) {
		if (this.head == null) {
			ListNode node = new ListNode(x);
			this.head = node;
		} else {
			// finds the last node in the chain of nodes
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			// adds a new node at the end of the chain
			ListNode node = new ListNode(x);
			current.next = node;
		}
	}
}