package leetcode_simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: linccy
 * @description: Write a program that outputs the string representation of
 *               numbers from 1 to n.
 * 
 *               But for multiples of three it should output ¡°Fizz¡± instead of
 *               the number and for the multiples of five output ¡°Buzz¡±. For
 *               numbers which are multiples of both three and five output
 *               ¡°FizzBuzz¡±. Example:
 * 
 *               n = 15,
 * 
 *               Return: [ "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
 *               "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz" ]
 */

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FizzBuzz demo = new FizzBuzz();
		int n = scan.nextInt();
		System.out.println(demo.fizzBuzz(n));
	}

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				list.add("FizzBuzz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
}
