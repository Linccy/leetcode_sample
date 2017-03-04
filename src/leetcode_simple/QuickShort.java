/**
 * @author lcc 957109587@qq.com
 * @version 2017年3月4日 上午10:16:14
 * @Description
 */
public class QuickShort {
    public static void main(String[] args) {
        int[] arr = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        q_short(arr);
        for (int value : arr) {
            System.out.print(value + ", ");
        }
    }

    private static void q_short(int[] arr) {
        quickShort(arr, 0, arr.length - 1);
    }

    private static void quickShort(int[] arr, int i, int j) {
        if (i < j) {
            int result = pa(arr, i, j);
            quickShort(arr, i, result - 1);
            quickShort(arr, result + 1, j);
        }
    }

    private static int pa(int[] arr, int i, int j) {
        int key = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= key) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = key;
        return i;
    }
}
