package short_simple;


public class MinStack {

	private class Node {
		public int val;
		public Node next;
	}

	public Node head = new Node();
	public Node cursor = head;

	public void push(int node) {
		Node newnode = new Node();
		newnode.val = node;
		newnode.next = cursor;
		cursor = newnode;
	}

	public void pop() {
		cursor = cursor.next;
	}

	public int top() {
		return cursor.val;
	}

	public int min() {
		int minValue = Integer.MAX_VALUE;
		Node temp = cursor;
		while (temp.next != null) {
			minValue = minValue > temp.val ? temp.val : minValue;
			temp = temp.next;
		}
		return minValue;
	}
}
