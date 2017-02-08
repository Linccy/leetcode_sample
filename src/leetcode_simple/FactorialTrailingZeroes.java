package leetcode_simple;

import java.util.Scanner;

public class FactorialTrailingZeroes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FactorialTrailingZeroes demo = new FactorialTrailingZeroes();
		int n = scan.nextInt();
		System.out.println(demo.trailingZeroes(n));
	}

	public int trailingZeroes(int n) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0) {
				res++;
			}
		}
		return res;
	}
}
