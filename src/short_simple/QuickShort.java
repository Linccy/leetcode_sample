package short_simple;

import java.util.Arrays;

public class QuickShort {

	public static void main(String[] args) {
		int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };
		quickShort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] quickShort(int[] arr, int low, int high) {

		if (low < high) {
			int result = qa(arr, low, high);
			quickShort(arr, low, result - 1);
			quickShort(arr, result + 1, high);
		}

		return null;
	}

	private static int qa(int[] arr, int low, int high) {
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
