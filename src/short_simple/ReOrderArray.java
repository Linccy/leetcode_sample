package short_simple;

import java.util.ArrayList;
import java.util.List;

public class ReOrderArray {
	/**
	 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
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
