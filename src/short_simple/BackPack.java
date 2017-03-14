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
	 *            表示背包的最大容量
	 * @param num
	 *            表示商品个数
	 * @param weight
	 *            表示商品重量数组
	 * @param price
	 *            表示商品价值数组
	 */
	public static int[][] backPack_Solution(int maxP, int num, int[] weight, int[] price) {
		// c[i][v]表示前i件物品恰放入一个重量为m的背包可以获得的最大价值
		int c[][] = new int[num + 1][maxP + 1];
		for (int i = 0; i < num + 1; i++)
			c[i][0] = 0;

		for (int j = 0; j < maxP + 1; j++)
			c[0][j] = 0;

		for (int i = 1; i < num + 1; i++) {
			for (int j = 1; j < maxP + 1; j++) {
				// 当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之一：
				// (1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的值
				// (2)物品i放入背包中，则背包剩余重量为j-w[i-1],所以c[i][j]为c[i-1][j-w[i-1]]的值加上当前物品i的价值
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