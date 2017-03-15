package short_simple;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * 
 * @author Administrator
 *
 */
public class MinCountK {
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		if (k > input.length) {
			return new ArrayList<>();
		}
		quicksort(input, 0, input.length - 1);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			list.add(input[i]);
		}
		return list;
	}

	public void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			int result = qa(arr, low, high);
			quicksort(arr, low, result - 1);
			quicksort(arr, result + 1, high);
		}
	}

	public int qa(int[] arr, int low, int high) {
		int key = arr[low];
		while (low < high) {
			while (low < high && arr[high] >= key) {
				high--;
			}
			arr[low] = arr[high];
			while (low < high && arr[low] <= key) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = key;
		return low;
	}
}
