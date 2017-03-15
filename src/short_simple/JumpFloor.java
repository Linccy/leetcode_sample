package short_simple;

public class JumpFloor {
	/**
	 * 跳台阶
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法 
	 * f(n) = f(n-1)+f(n-2)
	 * 
	 * @param target
	 * @return
	 */
	public int JumpFloor(int target) {
		if (target <= 2) {
			return target;
		}
		int[] arr = new int[target + 1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i <= target; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[target];
	}

	/**
	 * 变态跳台阶 
	 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
	 * f(n) = f(n-1)+f(n-2)+....+f(0)
	 * 
	 * @param target
	 * @return
	 */
	public int JumpFloorII(int target) {
		int[] arr = new int[target + 1];
		if (target < 3) {
			return target;
		}
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i < target + 1; i++) {
			int value = 0;
			for (int j = i; j >= 0; j--) {
				value = value + arr[j];
			}
			arr[i] = value;
		}
		return arr[target];
	}
}
