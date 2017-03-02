package leetcode_simple;

public class Niuke {
	public static void main(String[] args) {
		System.out.println(countBitDiff(0, 2147483647));
	}

	public static int countBitDiff(int m, int n) {
		int dif = m ^ n;
		int cnt = 0;
		while (dif != 0) {
			if (dif % 2 == 1) {
				cnt++;
			}
			dif /= 2;
		}
		return cnt;
	}
}
