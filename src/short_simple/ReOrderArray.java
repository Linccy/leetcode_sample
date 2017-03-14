package short_simple;

import java.util.ArrayList;
import java.util.List;

public class ReOrderArray {
	/**
	 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
	 * @param array
	 */
	public void reOrderArray(int[] array) {
        List<Integer> arrJ = new ArrayList<>();
        List<Integer> arrO = new ArrayList<>();
        for (int value : array) {
            if (value % 2 != 0) {
                arrJ.add(value);
            } else {
                arrO.add(value);
            }
        }

        for (int i = 0; i < arrJ.size(); i++) {
            array[i] = arrJ.get(i);
        }
        for (int j = 0; j < arrO.size(); j++) {
            array[arrJ.size() + j] = arrO.get(j);
        }
    }
}
