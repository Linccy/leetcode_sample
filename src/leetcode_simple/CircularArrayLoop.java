package leetcode_simple;

public class CircularArrayLoop {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -1, -2, -2 };
		CircularArrayLoop circularArrayLoop = new CircularArrayLoop();
		System.out.println(circularArrayLoop.circularArrayLoop(arr));
	}

	public boolean circularArrayLoop(int[] nums) {
		int index = 0;
		int circularLength;
		boolean orientation;
		if (nums[0] < 0) {
			orientation = false;
		} else if (nums[0] == 0) {
			return false;
		} else {
			orientation = true;
		}
		if (orientation) {
			for (int i = 0; i < nums.length; i++) {
				index += nums[i];
				index = index % nums.length - 1;
				if (nums[index] < 0)
					return false;
				
			}
		} else {

		}
		return false;
	}
}
