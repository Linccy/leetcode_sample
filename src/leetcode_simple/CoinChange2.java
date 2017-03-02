package leetcode_simple;

import java.util.Scanner;

/* *
 * @author: linccy
 * @description:
 * 
 * */
public class CoinChange2 {
	public static void main(String[] args) {
		int amount = 127;
		int[] coins = { 1, 2, 5 };
		CoinChange2 demo = new CoinChange2();
		System.out.println(demo.change(amount, coins));
	}

	public int change(int amount, int[] coins) {
		if (amount < 1) {  
	        return 0;  
	    }  
	    int[] cache = new int[amount + 1];  
	    int sum = 1;  
	    while (sum <= amount) {  
	        int min = -1;  
	        for (int coin : coins) {  
	            if (sum >= coin && cache[sum - coin] != -1) {  
	                int temp = cache[sum - coin] + 1;  
	                min = min < 0 ? temp : (temp < min ? temp : min);  
	            }  
	        }  
	        cache[sum] = min;  
	        sum++;
	    }  
	    for(int value:cache){
	    	System.out.print(value+" ");
	    }
	    System.out.println();
	    return cache[amount];  
	}
}
