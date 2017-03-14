package short_simple;

import java.util.Arrays;

public class QuickShort {

	public static void main(String[] args) {
		int arr[] = { 72, 6, 57, 88, 60, 42, 83, 73, 48, 85 };
		quickShort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] quickShort(int[] arr, int i, int j) {
		
		if(i<j){
			int result = qa(arr,i,j);
			quickShort(arr, i, result-1);
			quickShort(arr, result+1, j);
		}
		
		return null;
	}

	private static int qa(int[] arr, int i, int j) {
		int key = arr[i];
		while(i<j){
			while(i<j&&arr[j]>=key){
				j--;
			}
			arr[i] = arr[j];
			while(i<j&&arr[i]<=key){
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = key;
		return i;
	}
}
