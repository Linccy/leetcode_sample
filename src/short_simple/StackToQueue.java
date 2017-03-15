package short_simple;

import java.util.Stack;
/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
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
