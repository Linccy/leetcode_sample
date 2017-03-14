package short_simple;

import java.util.Stack;
/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author Administrator
 *
 */
public class StackToQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
		stack2.clear();
		for (int i = stack1.size() - 1; i >= 0; i--) {
			stack2.push(stack1.get(i));
		}
	}

	public int pop() {
		int value = stack2.pop();
		stack1.clear();
		for (int i = stack2.size() - 1; i >= 0; i--) {
			stack1.push(stack2.get(i));
		}
		return value;
	}
}
