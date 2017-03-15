package short_simple;

public class BackPack {
	public static void main(String[] args) {
		int maxp = 10;
		int num = 3;
		int weight[] = { 3, 4, 5 };
		int price[] = { 4, 5, 6 };
		int c[][] = backPack_Solution(maxp, num, weight, price);
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= maxp; j++) {
				System.out.print(c[i][j] + "\t");
				if (j == maxp) {
					System.out.println();
				}
			}
		}
		// printPack(c, w, m, n);

	}

	/**
	 * @param maxP
	 *            ��ʾ�������������
	 * @param num
	 *            ��ʾ��Ʒ����
	 * @param weight
	 *            ��ʾ��Ʒ��������
	 * @param price
	 *            ��ʾ��Ʒ��ֵ����
	 */
	public static int[][] backPack_Solution(int maxP, int num, int[] weight, int[] price) {
		// c[i][v]��ʾǰi����Ʒǡ����һ������Ϊm�ı������Ի�õ�����ֵ
		int c[][] = new int[num + 1][maxP + 1];
		for (int i = 0; i < num + 1; i++)
			c[i][0] = 0;

		for (int j = 0; j < maxP + 1; j++)
			c[0][j] = 0;

		for (int i = 1; i < num + 1; i++) {
			for (int j = 1; j < maxP + 1; j++) {
				// ����ƷΪi������Ϊjʱ�������i��������(w[i-1])С������jʱ��c[i][j]Ϊ�����������֮һ��
				// (1)��Ʒi�����뱳���У�����c[i][j]Ϊc[i-1][j]��ֵ
				// (2)��Ʒi���뱳���У��򱳰�ʣ������Ϊj-w[i-1],����c[i][j]Ϊc[i-1][j-w[i-1]]��ֵ���ϵ�ǰ��Ʒi�ļ�ֵ
				if (weight[i - 1] <= j) {
					if (c[i - 1][j] < (c[i - 1][j - weight[i - 1]] + price[i - 1]))
						c[i][j] = c[i - 1][j - weight[i - 1]] + price[i - 1];
					else
						c[i][j] = c[i - 1][j];
				} else
					c[i][j] = c[i - 1][j];
			}
		}
		return c;
	}
}