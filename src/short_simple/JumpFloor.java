package short_simple;

public class JumpFloor {
	/**
	 * ��̨��
	 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж��������� 
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
	 * ��̬��̨�� 
	 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
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
