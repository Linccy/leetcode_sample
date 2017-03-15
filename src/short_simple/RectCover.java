package short_simple;

public class RectCover {
	/**
	 * ��Ŀ���� ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
	 * 
	 * @param target
	 * @return
	 */
	public int RectCover(int target) {
		if (target == 1) {
			return 1;
		}
		if (target == 0) {
			return 0;
		}
		if (target == 2) {
			return 2;
		}
		int num0 = 1;
		int num1 = 2;
		int n1 = 0;
		for (int i = 0; i < target - 2; i++) {
			n1 = num0 + num1;
			num0 = num1;
			num1 = n1;
		}
		return n1;
	}
}
