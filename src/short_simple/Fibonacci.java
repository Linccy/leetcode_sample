package short_simple;

public class Fibonacci {
	/**
	 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
	 * @param n
	 * @return
	 */
	public int Fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        int num0 = 0;
        int num1 = 1;
        int n1 = 0;
        for (int i = 0; i < n - 1; i++) {
            n1 = num0 + num1;
            num0 = num1;
            num1 = n1;
        }
        return n1;
    }
}
