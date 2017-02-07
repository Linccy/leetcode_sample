package leetcode_simple;

import java.util.Scanner;

/**
 * @author: linccy
 * @description: Find the largest palindrome made from the product of two
 *               n-digit numbers.
 * 
 *               Since the result could be very large, you should return the
 *               largest palindrome mod 1337.
 * 
 *               Example:
 * 
 *               Input: 2
 * 
 *               Output: 987
 * 
 *               Explanation: 99 x 91 = 9009, 9009 % 1337 = 987
 * 
 *               Note:
 * 
 *               The range of n is [1,8].
 */
public class PalindromeDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PalindromeDemo demo = new PalindromeDemo();
		int n = scan.nextInt();
		System.out.println(demo.largestPalindrome(n));
	}

	public int largestPalindrome(int n) {
		System.out.println("n");
		int numA = (int) Math.pow(10, n) - 1;
		int numB = (int) Math.pow(10, n) - 1;
		for (int a = 0; numA > Math.pow(10, n - 1); a++, numA--) {
			for (int b = 0; numB > Math.pow(10, n - 1); b++, numB--) {
				int result = numA * numB;
				if (isPalindrome(result)) {
					// System.out.println(result);
					return result % 1337;
				}
			}
			// System.out.println(numA + "," + numB);
		}
		// System.out.println(numA + "," + numB);
		return 0;
	}

	public boolean isPalindrome(int palindrome) {
		boolean isPalindrome;
		String paliStr = String.valueOf(palindrome);
		for (int i = 0; i < paliStr.length(); i++) {
			if (paliStr.charAt(i) != paliStr.charAt(paliStr.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
