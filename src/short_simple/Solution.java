package short_simple;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("we are man");
		// System.out.println(replaceSpace(str));
	}

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	Stack<ListNode> stack = new Stack<>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		while (listNode.next != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<>();
		
		while(!stack.isEmpty()){
			list.add(stack.pop().val);
		}
		
		return list;
	}
}